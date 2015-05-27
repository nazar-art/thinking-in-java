package courses.jol;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.util.VMSupport;

import static net.mindview.util.Print.print;

public class JOLSample_12_ThinLocking {
    /*
     * This is another dive into the mark word.
     *
     * Among other things, mark words store locking information.
     * We can clearly see how the mark word contents change when
     * we acquire the lock, and release it subsequently.
     *
     * This one is the example of thin (displaced) lock. The data
     * in mark word when lock is acquired is the reference to the
     * displaced object header, allocated on stack. Once we leave
     * the lock, the displaced header is discarded, and mark word
     * is reverted to the default value.
     */

    public static void main(String[] args) throws Exception {
        print(VMSupport.vmDetails());

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
