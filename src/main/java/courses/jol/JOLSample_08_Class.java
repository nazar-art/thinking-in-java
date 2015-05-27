package courses.jol;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.util.VMSupport;

import static net.mindview.util.Print.print;

public class JOLSample_08_Class {
    /*
     * Another example of special treatment for some fields.
     *
     * If you run this example, you can see the large gap in instance field block.
     * There are no Java fields that could claim that block, hence there are no
     * "hidden" fields, like in the example before. This time, VM "injects" some
     * of the fields into the Class, to store some of the meta-information there.
     *
     * See:
     *  http://hg.openjdk.java.net/jdk8/jdk8/hotspot/file/tip/src/share/vm/classfile/javaClasses.hpp
     *  http://hg.openjdk.java.net/jdk8/jdk8/hotspot/file/tip/src/share/vm/classfile/javaClasses.cpp
     */

    public static void main(String[] args) throws Exception {
        print(VMSupport.vmDetails());
        print(ClassLayout.parseClass(Class.class).toPrintable());
    }
}
