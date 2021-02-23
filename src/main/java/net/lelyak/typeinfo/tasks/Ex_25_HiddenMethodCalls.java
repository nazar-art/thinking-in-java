package net.lelyak.typeinfo.tasks;

import java.lang.reflect.Method;

import net.lelyak.typeinfo.classa.A;

public class Ex_25_HiddenMethodCalls {

    static void callHiddenMethod(Object a, String methodName) throws Exception {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }

    public static void main(String[] args) throws Exception {
        class B extends A {
            public void b() {
                super.b();
            }
        }

        A objA = new A();
        callHiddenMethod(objA, "a");
        callHiddenMethod(objA, "b");
        callHiddenMethod(objA, "c");

        B objB = new B();
        objB.b();
    }

}
