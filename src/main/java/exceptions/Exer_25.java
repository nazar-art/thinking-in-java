package exceptions;

@SuppressWarnings("serial")
/*
 * Exercise 25: (2) Create a three-level hierarchy of exceptions. Now create a base-class A
 with a method that throws an exception at the base of your hierarchy. Inherit B from A and
 override the method so it throws an exception at level two of your hierarchy. Repeat by
 inheriting class C from B. In main( ), create a C and upcast it to A, then call the method.
 */

class BaseLevelException extends Exception {
    BaseLevelException(String msg) {
        super(msg);
        //System.out.println(msg);
    }
}

@SuppressWarnings("serial")
class FirstLevelException extends BaseLevelException {
    FirstLevelException(String m) {
        super(m);
        //System.out.println(m);
    }
}

@SuppressWarnings("serial")
class SecondLevelException extends FirstLevelException {
    SecondLevelException(String s) {
        super(s);
        //System.out.println(s);
    }
}

class A {

    void a() throws BaseLevelException {
        throw new BaseLevelException("A thrown BaseLevelException");
    }
}

class B extends A {
    @Override
    void a() throws FirstLevelException {
        throw new FirstLevelException("B thrown FirstLevelException");
    }
}

class C extends B {
    @Override
    void a() throws SecondLevelException {
        throw new SecondLevelException("C thrown SecondLevelException");
    }
}

public class Exer_25 {
    public static void main(String[] args) {
        A object = new C();
        try {
            object.a();
        } catch (BaseLevelException e) {
            System.out.println("Caught " + e);
        }
    }
}
