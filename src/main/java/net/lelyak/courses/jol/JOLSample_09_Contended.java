package net.lelyak.courses.jol;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.util.VMSupport;

import static net.lelyak.mindview.util.Print.print;

public class JOLSample_09_Contended {
    /*
     * This is an example of special net.lelyak.annotations that can affect the field layout.
     * (This example requires JDK 8 to run, -XX:-RestrictContended should also be used)
     *
     * In order to dodge false sharing, users can put the @Contended annotation
     * on the selected fields/classes. The conservative effect of this annotation
     * is laying out the fields at sparse offsets, effectively providing the
     * artificial padding.
     */

    public static void main(String[] args) throws Exception {
        print(VMSupport.vmDetails());
        print(ClassLayout.parseClass(B.class).toPrintable());
    }

    public static class A {
        int a;
        int b;
        /*@sun.misc.Contended*/  int c;
        int d;
    }

    public static class B extends A {
        int e;
    }
}
