package net.lelyak.arrays;

/*
 * Exercise 1: (2) Create a method that takes an array of BerylliumSphere as an
 *	argument. Call the method, creating the argument dynamically. Demonstrate that ordinary
 *	aggregate array initialization doesn’t work in this case. Discover the only situations where
 *	ordinary aggregate array initialization works, and where dynamic aggregate initialization is
 *	redundant.
 */
class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}

public class E01 {

    private static void call(BerylliumSphere[] berylliumSphere) {
        StringBuilder builder = new StringBuilder(1024);
        for (BerylliumSphere sphere : berylliumSphere) {
            builder.append(sphere).append(" ");
        }
        builder.delete(berylliumSphere.length - 1, berylliumSphere.length);
        System.out.println(builder);
    }

    public static void main(String[] args) {
        // Dynamic aggregate initialization:
        call(new BerylliumSphere[]{new BerylliumSphere(),
                new BerylliumSphere(), new BerylliumSphere()});

        BerylliumSphere[] sphere = {new BerylliumSphere(),
                new BerylliumSphere(), new BerylliumSphere()};
        call(sphere);
    }
}
