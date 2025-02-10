package net.lelyak.typeinfo.toys;

import java.util.Arrays;

/**
 * This program demonstrates the merge sort algorithm by
 * sorting an array that is filled with random numbers.
 */
public class MergeSortDemo {
    public static void main(String[] args) {
        int[] a = ArrayUtil.randomIntArray(20, 100);
        System.out.println("Original array:");
        System.out.println(Arrays.toString(a));

        MergeSorter sorter = new MergeSorter(a);
        sorter.sort();
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(a));
    }
}
