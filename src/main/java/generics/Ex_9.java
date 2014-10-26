package generics;

/*
 * Exercise 9: (1) Modify GenericMethods.java so that f( ) accepts three arguments, all
 *	of which are of a different parameterized type.
 */

class GenericMethods {
    public <T, E, V> void f(T x, E el2, V el3) {
        System.out.println(x.getClass().getName());
        System.out.println(el2.getClass().getName());
        System.out.println(el3.getClass().getName());
    }
}

public class Ex_9 {
    public static void main(String[] args) {
        GenericMethods methods = new GenericMethods();
        methods.f("hello", 890L, methods);
    }
}
