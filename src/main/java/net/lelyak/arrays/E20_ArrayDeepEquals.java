package net.lelyak.arrays;

import java.util.Arrays;

/*
 * Exercise 20: (4) Demonstrate deepEquals( ) for multidimensional net.lelyak.arrays.
 */

public class E20_ArrayDeepEquals {

    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5},
                {6}
        };

        int[][] arr2 = {
                {1, 2, 3},
                {4, 5},
                {6}
        };

        System.out.println(Arrays.deepEquals(arr1, arr2));
    }

}
