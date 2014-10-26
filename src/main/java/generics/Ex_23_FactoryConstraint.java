package generics;

/*
 * Exercise 23: (1) Modify FactoryConstraint.java so that create( ) takes an
 *	argument.
 */

interface FactoryI<T> {
    T create(int arg);
}

class Foo2<T> {
    @SuppressWarnings("unused")
    private T x;

    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create(1);
    }
    // ...
}

class IntegerFactory implements FactoryI<Integer> {
    public Integer create(int arg) {
        return new Integer(arg);
    }
}

class Widget {
    private final int id;

    public Widget(int ident) {
        id = ident;
    }

    @Override
    public String toString() {
        return "Widget " + id;
    }

    public static class Factory implements FactoryI<Widget> {
        public Widget create(int arg) {
            return new Widget(arg);
        }
    }
}

public class Ex_23_FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Factory());
    }
}
