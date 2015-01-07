package courses.procedural.loops;

import java.util.Arrays;

public class ArrayCopyDemo {

    private static void testArraycopyFor32(byte[] array) {
        long start = System.nanoTime();
        System.arraycopy(array, 0, array, 1, array.length - 1);
        long stop = System.nanoTime();
        System.out.printf("arraycopy: %,10d\n", stop - start);
    }

    private static void testFor32(byte[] array) {
        long start = System.nanoTime();
        for (int k = 0; k < array.length - 2; k++) {
            array[k + 1] = array[k];
        }
        long stop = System.nanoTime();
        System.out.printf("for:       %,10d\n", stop - start);
    }

    private static void testArraycopyFor64(long[] array) {
        long start = System.nanoTime();
        System.arraycopy(array, 0, array, 1, array.length - 1);
        long stop = System.nanoTime();
        System.out.printf("arraycopy: %,10d\n", stop - start);
    }

    private static void testFor64(long[] array) {
        long start = System.nanoTime();
        for (int k = 0; k < array.length - 2; k++) {
            array[k + 1] = array[k];
        }
        long stop = System.nanoTime();
        System.out.printf("for:       %,10d\n", stop - start);
    }

    public static void main(String[] args) {
//        insertWithBinarySearch();
        byte[] biteArray = new byte[1_000_000];
        long[] longArray = new long[1_000_000];
        testArraycopyFor32(biteArray);
        testFor32(biteArray);
//        testArraycopyFor64(longArray);
//        testFor64(longArray);
}

    private static void insertWithBinarySearch() {
        int size = 5;
        int[] array = {20, 30, 40, 50, 60, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(array));
        int[] insert = {15, 95, 30};

        for (int newElem : insert) {
            int newPos = Arrays.binarySearch(array, 0, size, newElem);
            if (newPos < 0) { // change position to inserted variant
                newPos = -newPos - 1;
            }
            System.arraycopy(array, newPos, array, newPos + 1, size - newPos);
            array[newPos] = newElem;
            System.out.println(Arrays.toString(array));
            size++;
        }
    }
}
