package net.lelyak.typeinfo.reflection;

/*
 * Exercise 21: (3) Modify SimpleProxyDemo.java so that it measures method-call
 *	times.
 *
 * Exercise 23: (3) Inside invoke( ) in SimpleDynamicProxy.java, try to print the
 *	proxy argument and explain what happens.
 */

interface Interface {

    void doSomething();

    void somethingElse(String arg);
}

class RealObject implements Interface {

    public void doSomething() {
        System.out.println("doSomething");
    }

    public void somethingElse(String arg) {

        System.out.println("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface {
    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    public void doSomething() {
        long startTime = System.nanoTime();

        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();

        long elapsedTime = System.nanoTime() - startTime;
        System.out.printf("%nMethod SimpleProxy.doSomething() was running %d ns%n", elapsedTime);
    }

    public void somethingElse(String arg) {
        long startTime = System.nanoTime();

        System.out.println("SimpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);

        long elapsedTime = System.nanoTime() - startTime;
        System.out.printf("%nMethod SimpleProxy.somethingElse() was running %d ns%n", elapsedTime);
    }
}

public class Ex_21 {

    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
