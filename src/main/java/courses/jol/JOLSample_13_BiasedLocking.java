package courses.jol;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.util.VMSupport;

import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;

public class JOLSample_13_BiasedLocking {
    /*
     * This is the example of biased locking.
     *
     * In order to demonstrate this, we first need to sleep for >5 seconds
     * to pass the grace period of biased locking. Then, we do the same
     * trick as the example before. You may notice that the mark word
     * had not changed after the lock was released. That is because
     * the mark word now contains the reference to the thread this object
     * was biased to.
     */

    public static void main(String[] args) throws Exception {
        print(VMSupport.vmDetails());

        TimeUnit.SECONDS.sleep(6);

        final A a = new A();

        ClassLayout layout = ClassLayout.parseClass(A.class);

        print("**** Fresh object");
        print(layout.toPrintable(a));

        synchronized (a) {
            print("**** With the lock");
            print(layout.toPrintable(a));
        }

        print("**** After the lock");
        print(layout.toPrintable(a));
    }

    public static class A {
        // no fields
    }
}
