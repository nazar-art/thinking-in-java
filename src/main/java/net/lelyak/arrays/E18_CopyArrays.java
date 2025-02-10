package net.lelyak.arrays;

import java.lang.reflect.Field;
import java.util.Arrays;

/*
 * Exercise 18: (3) 
 * Create and fill an array of BerylliumSphere. Copy this array to a new
 *	array and show that it’s a shallow copy.
 */

public class E18_CopyArrays {
    // BerylliumSphere.id is private, so we need to use
    // reflection to alter its value.
    static void setID(BerylliumSphere bs, long value) {
        try {
            Field fid = BerylliumSphere.class.getDeclaredField("id");
            fid.setAccessible(true);
            fid.setLong(bs, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        BerylliumSphere[] a = new BerylliumSphere[4];
        Arrays.fill(a, new BerylliumSphere());

        BerylliumSphere[] b = new BerylliumSphere[4];
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.println("copy array");
        System.arraycopy(a, 0, b, 0, b.length);
        System.out.println("b = " + Arrays.toString(b));

        System.out.println("changing some a values");
        // Changing a reference in 'a' will not impact 'b'.
        a[1] = a[3] = new BerylliumSphere();
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));

        System.out.println("changing object state of a");
        // Changing an object's state will impact 'b', as well.
        setID(a[0], -1L);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));

    }
}
