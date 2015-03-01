package courses.jol;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.util.VMSupport;

import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;

public class JOLSample_14_FatLocking {
    /*
     * This is the example of fat locking.
     *
     * If VM detects contention on thread, it needs to delegate the
     * access arbitrage to OS. That involves associating the object
     * with the native lock, i.e. "inflating" the lock.
     *
     * In this example, we need to simulate the contention, this is
     * why we have the additional thread. You can see the fresh object
     * has the default mark word, the object before the lock was already
     * acquired by the auxiliary thread, and when the lock was finally
     * acquired by main thread, it had been inflated. The inflation stays
     * there after the lock is released. You can also see the lock is
     * "deflated" after the GC (the lock cleanup proceeds in safepoints,
     * actually).
     */

    public static void main(String[] args) throws Exception {
        print(VMSupport.vmDetails());

        final A a = new A();

        ClassLayout layout = ClassLayout.parseClass(A.class);

        print("**** Fresh object");
        print(layout.toPrintable(a));

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (a) {
                    try {
                        TimeUnit.SECONDS.sleep(10);
                    } catch (InterruptedException e) {
                        return;
                    }
                }
            }
        });

        t.start();

        TimeUnit.SECONDS.sleep(1);

        print("**** Before the lock");
        print(layout.toPrintable(a));

        synchronized (a) {
            print("**** With the lock");
            print(layout.toPrintable(a));
        }

        print("**** After the lock");
        print(layout.toPrintable(a));

        System.gc();

        print("**** After System.gc()");
        print(layout.toPrintable(a));
    }

    public static class A {
        // no fields
    }
}
