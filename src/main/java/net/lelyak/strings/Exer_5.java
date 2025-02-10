package net.lelyak.strings;

import java.math.BigInteger;
import java.util.Formatter;
import java.util.Locale;

/*
 * Exercise 5: (5) For each of the basic conversion types in the above table, write the most
	complex formatting expression possible. That is, use all the possible format specifiers
	available for that conversion type.
	d Integral (as decimal)
	
**********************
c	Unicode character
b	Boolean value
s 	String
f 	Floating point (as decimal)
e 	Floating point (in scientific notation)
x 	Integral (as hex)
h 	Hash code (as hex)
 */

public class Exer_5 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Formatter f = new Formatter(System.out, Locale.US);

        char u = 'a';
        System.out.println("u = 'a'");
        f.format("s: %1$-10s\n", u);
        f.format("c: %1$-10c\n", u);
        f.format("b: %1$-10.10b\n", u);
        f.format("h: %1$-10.10h\n", u);
        System.out.println();
        int v = 1000;
        System.out.println("v = 1000");
        f.format("d 1: %1$(,0+10d\n", v);
        f.format("d 2: %1$-(, 10d\n", v);
        f.format("d 3, v = -v: %1$-(, 10d\n", -v);
        f.format("c, v = 121: %1$-10c\n", 121);
        f.format("b: %1$-10.10b\n", v);
        f.format("s: %1$-10.10s\n", v);
        f.format("x: %1$-10x\n", v);
        f.format("h: %1$-10.10h\n", v);
        System.out.println();
        BigInteger w = new BigInteger("50000000000000");
        System.out.println("w = new BigInteger(\"50000000000000\")");
        f.format("d 1: %1$(,0+10d\n", w);
        f.format("d 2: %1$-(, 10d\n", w);
        f.format("d 3, w = -w: %1$-(, 10d\n", w.negate());
        f.format("b: %1$-10.10b\n", w);
        f.format("s: %1$-10.10s\n", w);
        f.format("x 1: %1$(0+10x\n", w);
        f.format("x 2: %1$-( 10x\n", w);
        f.format("x 3, w = -w: %1$-( 10x\n", w.negate());
        f.format("h: %1$-10.10h\n", w);
        System.out.println();
        double x = 179.543;
        System.out.println("x = 179.543");
        f.format("b: %1$-10.10b\n", x);
        f.format("s: %1$-10.10s\n", x);
        f.format("f 1: %1$(,0+10.2f\n", x);
        f.format("f 2: %1$(,- 10.2f\n", x);
        f.format("f 3, x = -x: %1$(,0+10.2f\n", -x);
        f.format("e 1: %1$(0+10.2e\n", x);
        f.format("e 2: %1$(- 10.2e\n", x);
        f.format("e 3, x = -x: %1$(0+10.2e\n", -x);
        f.format("h: %1$-10.10h\n", x);
        System.out.println();
        Object y = new Object();
        System.out.println("y = new Object()");
        f.format("b: %1$-10.10b\n", y);
        f.format("s: %1$-10.10s\n", y);
        f.format("h: %1$-10.10h\n", y);
        System.out.println();
        boolean z = false;
        System.out.println("z = false");
        f.format("b: %1$-10.10b\n", z);
        f.format("s: %1$-10.10s\n", z);
        f.format("h: %1$-10.10h\n", z);
        System.out.println();
        // A special no argument conversion type
        f.format("%%: %-10%");
    }
}
