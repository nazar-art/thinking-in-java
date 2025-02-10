package net.lelyak.courses.jol;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.util.VMSupport;

import static net.lelyak.mindview.util.Print.print;

public class JOLSample_01_Basic {
    /*
     * This sample showcases the basic field layout.
     * You can see a few notable things here:
     *   a) how much the object header consumes;
     *   b) how fields are laid out;
     *   c) how the external alignment beefs up the object size
     */

    public static void main(String[] args) throws Exception {
        print(VMSupport.vmDetails());
        print(ClassLayout.parseClass(A.class).toPrintable());
    }

    public static class A {
        boolean f;
    }
}
