package net.lelyak.operators;

import static net.lelyak.mindview.util.Print.print;

/****************** Exercise 9 *****************
 * Display the largest and smallest numbers for
 * both float and double exponential notation.
 ***********************************************/
public class E09_MinMaxExponents {
    public static void main(String[] args) {
        print("Float min value: " + Float.MIN_VALUE);
        print("Float max value: " + Float.MAX_VALUE);
        print("Float min exponent: " + Float.MIN_EXPONENT);
        print("Float max exponent: " + Float.MAX_EXPONENT);

        print("Double min value: " + Double.MIN_VALUE);
        print("Double max value: " + Double.MAX_VALUE);
        print("Double min exponent: " + Double.MIN_EXPONENT);
        print("Double max exponent: " + Double.MAX_EXPONENT);
    }
}
