package net.lelyak.courses.procedural.util;

import java.util.Arrays;

public class QuickSorter {
    private int[] array;

    public QuickSorter(int[] anArray) {
        array = anArray;
    }

    /**
     * Sorts the array managed by this merge sorter
     */
    public void sort() {
        sort(0, array.length - 1);
    }

    public void sort(int from, int to) {
        if (from >= to) return;
        int p = partition(from, to);
        sort(from, p);
        sort(p + 1, to);
    }

    private int partition(int from, int to) {
        int pivot = array[from];
        int i = from - 1;
        int j = to + 1;
        while (i < j) {
            i++;
            while (array[i] < pivot) i++;
            j--;
            while (array[j] > pivot) j--;
            if (i < j) swap(i, j);
        }
        return j;
    }

    /**
     * Swaps two entries of the array.
     *
     * @param first the first position to swap
     * @param second the second position to swap
     */
    private void swap(int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static void main(String[] args) {
        int[] a = ArrayUtil.randomIntArray(3000, 1000);
        System.out.println(Arrays.toString(a));

        QuickSorter sorter = new QuickSorter(a);
        StopWatch timer = new StopWatch();

        timer.start();
        sorter.sort();
        timer.stop();

        System.out.println(Arrays.toString(a));
        System.out.println("Elapsed time: " + timer.getElapsedTime() + " milliseconds");
    }
}
