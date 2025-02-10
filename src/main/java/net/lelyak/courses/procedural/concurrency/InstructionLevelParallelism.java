package net.lelyak.courses.procedural.concurrency;

public class InstructionLevelParallelism {
    public static void main(String[] args) {
//        variantOne();
//        variantTwoTwiceValue();
//        twoDigit();
        long t0 = System.currentTimeMillis();
        double d0 = 0;
        double d1 = 0;
        double d2 = 0;
        double d3 = 0;
        double d4 = 0;
        double d5 = 0;
        double d6 = 0;
        double d7 = 0;
        double d8 = 0;
        double d9 = 0;
        for (int k = 0; k < 100_000_000; k++) {
            d0 = d0 * d0;
            d1 = d1 * d1;
            d2 = d2 * d2;
            d3 = d3 * d3;
            d4 = d4 * d4;
            d5 = d5 * d5;
            d6 = d6 * d6;
            d7 = d7 * d7;
            d8 = d8 * d8;
            d9 = d9 * d9;
        }
        long t1 = System.currentTimeMillis();
        System.out.println(t1 - t0);
        System.out.println(d0 + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
    }

    private static void twoDigist() {
        long t0 = System.currentTimeMillis();
        double d0 = 0;
        double d1 = 0;
        for (int k = 0; k < 100_000_000; k++) {
            d0 = d0 * d0;
            d1 = d1 * d1;
        }
        long t1 = System.currentTimeMillis();
        System.out.println(t1 - t0);
        System.out.println(d0 + d1);
    }

    private static void variantTwoTwiceValue() {
        long t0 = System.currentTimeMillis();
        double d0 = 0;
        for (int k = 0; k < 100_000_000; k++) {
            d0 = d0 * d0;
            d0 = d0 * d0;
        }
        long t1 = System.currentTimeMillis();
        System.out.println(t1 - t0);
        System.out.println(d0);
    }

    private static void variantOne() {
        long t0 = System.currentTimeMillis();
        double d0 = 0;
        for (int k = 0; k < 100_000_000; k++) {
            d0 = d0 * d0;
        }
        long t1 = System.currentTimeMillis();
        System.out.println(t1 - t0);
        System.out.println(d0);
    }
}
