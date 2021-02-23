package net.lelyak.courses.jol;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.util.VMSupport;

import static net.lelyak.mindview.util.Print.print;

public class JOLSample_06_Gaps {
    /*
     * This example shows another HotSpot layout quirk.
     *
     * HotSpot rounds up the instance field block to four bytes.
     * That unfortunately yields the artificial gaps at the end of
     * the class.
     *
     * See also:
     *  https://bugs.openjdk.java.net/browse/JDK-8024912
     */

    public static void main(String[] args) throws Exception {
        print(VMSupport.vmDetails());
        print(ClassLayout.parseClass(C.class).toPrintable());
    }

    public static class A {
        boolean a;
    }

    public static class B extends A {
        boolean b;
    }

    public static class C extends B {
        boolean c;
    }
}
