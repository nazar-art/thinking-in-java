package net.lelyak.typeinfo.toys;

public class E10_PrimitiveOrTrue {
    public static void main(String args[]) {
        char[] ac = "Hello, World!".toCharArray();
        System.out.println("char.getClass() = " + ac.getClass());
        System.out.println("charSuperCl.getClass().getSuperclass() = "
                + ac.getClass().getSuperclass());

        @SuppressWarnings("unused")
        char c = 'c';
        // ! c.getClass(); // Can't do it, primitives
        // are not true objects.
        int[] ia = new int[3];
        System.out.println("int.getClass() = " + ia.getClass());
        long[] la = new long[3];
        System.out.println("long.getClass() = " + la.getClass());
        double[] da = new double[3];
        System.out.println("double.getClass() = " + da.getClass());
        String[] sa = new String[3];
        System.out.println("string.getClass() = " + sa.getClass());
        E10_PrimitiveOrTrue[] pot = new E10_PrimitiveOrTrue[3];
        System.out.println("objectArray.getClass() = " + pot.getClass());
        // Multi-dimensional net.lelyak.arrays:
        int[][][] threed = new int[3][][];
        System.out.println("threedOfInt.getClass() = " + threed.getClass());
    }

}
