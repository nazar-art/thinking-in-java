package net.lelyak.courses.jol;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.util.VMSupport;

import static net.lelyak.mindview.util.Print.print;

public class JOLSample_11_ClassWord {
    /*
     * This is the example to have insight into object headers.
     *
     * In HotSpot, object header consists of two parts: mark word,
     * and class word. We can clearly see the class word by analysing
     * two syntactically equivalent instances of two distinct classes.
     * See the difference in headers, that difference is the reference
     * to class.
     */

    public static void main(String[] args) throws Exception {
        print(VMSupport.vmDetails());
        print(ClassLayout.parseClass(A.class).toPrintable(new A()));
        print(ClassLayout.parseClass(B.class).toPrintable(new B()));
    }

    public static class A {
        // no fields
    }

    public static class B {
        // no fields
    }
}
