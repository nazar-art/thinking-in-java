package courses.jol;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.util.VMSupport;

import static net.mindview.util.Print.print;

public class JOLSample_07_Exceptions {
    /*
     * This example shows some of the fields are treated specially in VM.
     *
     * See the suspicious gap in Throwable class. If you look in the Java
     * source, you will see the Throwable.backtrace field, which is not
     * listed in the dump. This is because this field handles the VM internal
     * info which should not be accessible to users under no conditions.
     *
     * See also:
     *    http://bugs.openjdk.java.net/browse/JDK-4496456
     */

    public static void main(String[] args) throws Exception {
        print(VMSupport.vmDetails());
        print(ClassLayout.parseClass(Throwable.class).toPrintable());
    }
}
