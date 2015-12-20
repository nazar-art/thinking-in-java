package typeinfo;

//: typeinfo/SimpleProxyDemo.java

import static net.mindview.util.Print.*;

interface Interface {
    void doSomething();

    void somethingElse(String arg);
}

class RealObject implements Interface {
    public void doSomething() {
        print("doSomething");
    }

    public void somethingElse(String arg) {
        print("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface {
    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    public void doSomething() {
        print("SimpleProxy doSomething");

        long before = System.nanoTime();
        proxied.doSomething();
        long after = System.nanoTime();
        long delta = (before - after) / 1_000_000;
        System.out.println("method run time: " + delta);
    }

    public void somethingElse(String arg) {
        print("SimpleProxy somethingElse " + arg);

        long before = System.currentTimeMillis();
        proxied.somethingElse(arg);
        long after = System.currentTimeMillis();
//        long delta = (before - after) / 1_000_000_000;
        long delta = before - after;
        System.out.printf("method run time: %s ms\n", delta);
    }
}

class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
} /* Output:
doSomething
somethingElse bonobo
SimpleProxy doSomething
doSomething
SimpleProxy somethingElse bonobo
somethingElse bonobo
*///:~

