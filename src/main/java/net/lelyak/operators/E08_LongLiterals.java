package net.lelyak.operators;

import static net.lelyak.mindview.util.Print.print;

/****************** Exercise 8 *****************
 * Show that hex and octal notations work with long
 * values. Use Long.toBinaryString() to display
 * the results.
 ***********************************************/
public class E08_LongLiterals {
    public static void main(String[] args) {
        long l1 = 0x2f;
        print("l1: " + Long.toBinaryString(l1));
        long l2 = 0x2F;
        print("l2: " + Long.toBinaryString(l2));
        long l3 = 0177;
        print("l3: " + Long.toBinaryString(l3));
    }
}
