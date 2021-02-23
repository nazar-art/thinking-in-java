package net.lelyak.generics;

/*
 * Exercise 30: (2) Create a Holder for each of the primitive wrapper types, and show that
 *	autoboxing and autounboxing works for the set( ) and get( ) methods of each instance.
 */


public class E30_AutoboxingUnboxingTest {

    public static void main(String[] args) {
        Holder<Integer> hi = new Holder<>();
        hi.set(5);
        int i = hi.get();
        System.out.println(5 == i);
    }
}
