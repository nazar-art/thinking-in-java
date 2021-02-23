package net.lelyak.strings;

import java.util.Formatter;
import java.util.Locale;

/**
 * *************** Exercise 6 ******************
 * Create a class that contains int, long, float
 * and double fields. Create a toString() method
 * for this class that uses String.format(), and
 * demonstrate that your class works correctly.
 * **********************************************
 */

class DataHolder {
    int i = 145;
    long l = 789L;
    float f = 78.8F;
    double d = 34.9D;

    public String toString() {
        StringBuilder sb = new StringBuilder("DataHolder class: \n\n");
        Formatter formatter = new Formatter(Locale.US);
        sb.append(formatter.format("int field: %d\n", i));
        sb.append(formatter.format("long field: %d\n", l));
        sb.append(formatter.format("float field: %f\n", f));
        sb.append(formatter.format("double field: %f\n", d));

        return sb.toString();
    }
}

public class Exer_6 {
    public static void main(String[] args) {
        System.out.println(new DataHolder());
    }
}
