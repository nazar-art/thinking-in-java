package net.lelyak.generics;

import java.util.HashMap;
import java.util.Map;

/*
 * Exercise 21: (4) 
 * Modify ClassTypeCapture.java by adding a	Map<String,Class<?>>, 
 *  a method addType(String typename, Class<?> kind), and
 *	a method createNew(String typename). createNew() will either produce a new
 *	instance of the class associated with its argument string, or produce an error message.
 */

class Building {
}

class House extends Building {
}

public class ClassTypeCapture<T> {
    Map<String, Class<?>> types = new HashMap<>();

    public void addType(String typename, Class<?> aKind) {
        types.put(typename, aKind);
    }

    public Object createNew(String typename) {
        Class<?> cl = types.get(typename);
        try {
            return cl.newInstance();
        } catch (NullPointerException e) {
            System.out.println("Not a registered typename: " + typename);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return null;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        ClassTypeCapture ctt = new ClassTypeCapture();

        ctt.addType("Building", Building.class);
        ctt.addType("House", House.class);
        ctt.addType("Product", Product.class);

        System.out.println((ctt.createNew("Building").getClass()));
        System.out.println((ctt.createNew("House").getClass()));

        ctt.createNew("Product");
        ctt.createNew("Car");
    }
}