package net.lelyak.courses.procedural.util;

import java.util.Arrays;

/**
 * This class sorts an array, using the merge sort algorithm.
 */
public class MergeSorter {

    private int[] array;

    /**
     * Constructs array merge sorter.
     *
     * @param anArray the array to sort
     */
    public MergeSorter(int[] anArray) {
        array = anArray;
    }

    /**
     * Sorts the array managed by this merge sorter.
     */
    public void sort() {
        if (array.length <= 1) return;
        int[] first = new int[array.length / 2];
        int[] second = new int[array.length - first.length];

        // Copy the first half of array into first, the second half into second
        System.arraycopy(array, 0, first, 0, first.length);
        System.arraycopy(array, first.length, second, 0, second.length);

        MergeSorter firstSorter = new MergeSorter(first);
        MergeSorter secondSorter = new MergeSorter(second);
        firstSorter.sort();
        secondSorter.sort();
        merge(first, second);
    }

    /**
     * Merges two sorted net.lelyak.arrays into the array managed by this merge sorter.
     *
     * @param first  the first sorted array
     * @param second the second sorted array
     */
    private void merge(int[] first, int[] second) {
        int iFirst = 0; // Next element to consider in the first array
        int iSecond = 0; // Next element to consider in the second array
        int index = 0; // Next open position in array

        // As long as neither iFirst nor iSecond is past the end, move
        // the smaller element into array
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                array[index] = first[iFirst];
                iFirst++;
            } else {
                array[index] = second[iSecond];
                iSecond++;
            }
            index++;
        }

        // Note that only one of the two loops below copies entries
        // Copy any remaining entries of the first array
        while (iFirst < first.length) {
            array[index] = first[iFirst];
            iFirst++;
            index++;
        }
        // Copy any remaining entries of the second half
        while (iSecond < second.length) {
            array[index] = second[iSecond];
            iSecond++;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] a = ArrayUtil.randomIntArray(3000, 1000);
        System.out.println(Arrays.toString(a));

        MergeSorter sorter = new MergeSorter(a);
        StopWatch timer = new StopWatch();

        timer.start();
        sorter.sort();
        timer.stop();

        System.out.println(Arrays.toString(a));
        System.out.println("Elapsed time: " + timer.getElapsedTime() + " milliseconds");
    }
}

