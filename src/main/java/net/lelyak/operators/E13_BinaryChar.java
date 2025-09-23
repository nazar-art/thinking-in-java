package net.lelyak.operators;

import static net.lelyak.mindview.util.Print.print;

/****************** Exercise 13 *****************
 * Write a method to display char values in
 * binary form. Demonstrate it using several
 * different characters.
 ************************************************/
public class E13_BinaryChar {
    public static void main(String[] args) {
        print("A: " + Integer.toBinaryString('A'));
        print("!: " + Integer.toBinaryString('!'));
        print("x: " + Integer.toBinaryString('x'));
        print("7: " + Integer.toBinaryString('7'));
    }
}
