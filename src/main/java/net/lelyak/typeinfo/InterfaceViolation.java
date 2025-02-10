package net.lelyak.typeinfo;

//: net.lelyak.typeinfo/InterfaceViolation.java
// Sneaking around an interface.
import net.lelyak.typeinfo.interfacea.*;

class B implements A {
    public void f() {}
    public void g() {}
}

public class InterfaceViolation {
    public static void main(String[] args) {
        A a = new B();
        a.f();
        // a.g(); // Compile error
        System.out.println(a.getClass().getName());
        B b = (B)a;
        b.g();
    }
} /* Output:
B
*///:~

