package net.lelyak.courses.jol;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.util.VMSupport;

import static net.lelyak.mindview.util.Print.print;

public class JOLSample_05_InheritanceBarrier {
    /*
     * This example shows the HotSpot field layout quirk.
     * (Works best with 64-bit VMs)
     *
     * Even though we have the alignment gap before A.a field, HotSpot
     * does not claim it, because it does not track the gaps in the
     * already laid out superclasses. This yields the virtual
     * "inheritance barrier" between super- and sub-class fields blocks.
     *
     * See also:
     * https://bugs.openjdk.java.net/browse/JDK-8024913
     */

    public static void main(String[] args) throws Exception {
        print(VMSupport.vmDetails());
        print(ClassLayout.parseClass(C.class).toPrintable());
    }

    public static class A {
        long a;
    }

    public static class B extends A {
        long b;
    }

    public static class C extends B {
        long c;
        int d;
    }
}
