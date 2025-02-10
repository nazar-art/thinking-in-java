package net.lelyak.typeinfo.tasks;

// {Args: net.lelyak.typeinfo.tasks.Derived}

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

import static net.lelyak.mindview.util.Print.print;

/**
 * *************** Exercise 9 ******************
 * Modify the previous exercise so that it uses
 * Class.getDeclaredFields() to also display
 * information about the fields in a class.
 * *********************************************
 */
interface Iface {
    int i = 47;

    void f();
}

class Base implements Iface {
    String s;

    double d;

    @Override
    public void f() {
        System.out.println("Base.f()");
    }
}

class Composed {
    Base base;
}

class Derived extends Base {
    Composed composed;
    String string;
}

public class E09_GetDeclaredFields {

    private static Set<Class<?>> alreadyDisplayed = new HashSet<>();

    static void printClasses(Class<?> c) {
        // getSuperclass() returns null on Object:
        if (c == null) return;
        print(c.getName());
        Field[] fields = c.getDeclaredFields();
        if (fields.length != 0)
            print("\nFields:");
        for (Field fld : fields) {
            print("    " + fld);
        }
        for (Field fld : fields) {
            Class<?> k = fld.getType();
            if (!alreadyDisplayed.contains(k)) {
                printClasses(k);
                alreadyDisplayed.add(k);
            }
        }
        // Produces the interfaces that this class implements:
        for (Class<?> k : c.getInterfaces()) {
            print("Interface: " + k.getName());
            printClasses(k.getSuperclass());
        }
        printClasses(c.getSuperclass());
    }

    public static void main(String[] args) throws ClassNotFoundException {
        for (int i = 0; i < args.length; i++) {
            print("Displaying: " + args[i]);
            printClasses(Class.forName(args[i]));
            if (i < args.length - 1) {
                print("=========================");
            }
        }
    }
}
