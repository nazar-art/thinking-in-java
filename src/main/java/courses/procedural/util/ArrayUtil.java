package courses.procedural.util;

import java.util.Random;

public class ArrayUtil {

    private static Random generator = new Random();

    public static int[] randomIntArray(int length, int maxRandomNumber) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generator.nextInt(maxRandomNumber);
        }
        return arr;
    }
}
