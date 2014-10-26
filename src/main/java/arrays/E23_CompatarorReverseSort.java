package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/*
 * Exercise 23: (2) 
 * Create an array of Integer, fill it with random int values (using
 *	autoboxing), and sort it into reverse order using a Comparator.
 */

public class E23_CompatarorReverseSort implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
    }

    public static void main(String[] args) {
        Random random = new Random();
        Integer[] arr = new Integer[20];

        for (int i = 0; i < arr.length; i++) {
            // Arrays.fill(arr, random.nextInt(100));
            arr[i] = i * random.nextInt(1000);
        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }

}
