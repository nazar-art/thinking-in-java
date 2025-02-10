package net.lelyak.generics;

/*
 * Exercise 25: (2) 
 * Create two interfaces and a class that implements both. Create two
 *	generic methods, one whose argument parameter is bounded by the first interface and one
 *	whose argument parameter is bounded by the second interface. Create an instance of the
 *	class that implements both interfaces, and show that it can be used with both generic
 *	methods.
 */

interface Top {
    void a();

    void b();
}

interface Low {
    void c();

    void d();
}

class TopLowImpl implements Top, Low {

    @Override
    public void c() {
        System.out.println("Low.c()");
    }

    @Override
    public void d() {
        System.out.println("Low.d()");
    }

    @Override
    public void a() {
        System.out.println("Top.a()");
    }

    @Override
    public void b() {
        System.out.println("Top.b()");
    }
}

public class Ex_25_Bounds {

    static <T extends Top> void top(T obj) {
        obj.a();
        obj.b();
    }

    static <T extends Low> void low(T obj) {
        obj.c();
        obj.d();
    }

    public static void main(String[] args) {
        TopLowImpl topLowImpl = new TopLowImpl();
        top(topLowImpl);
        low(topLowImpl);
    }
}
