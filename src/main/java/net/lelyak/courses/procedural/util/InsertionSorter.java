package net.lelyak.courses.procedural.util;

/**
 * This class sorts an array, using the insertion sort
 * algorithm
 */
public class InsertionSorter {
    private int[] array;

    /**
     * Constructs an insertion sorter.
     *
     * @param anArray the array to sort
     */
    public InsertionSorter(int[] anArray) {
        array = anArray;
    }

    /**
     * Sorts the array managed by this insertion sorter
     */
    public void sort() {
        for (int border = 1; border < array.length; border++) {
            int next = array[border];
            // Move all larger elements up
            int index = border;
            while (index > 0 && array[index - 1] > next) {
                array[index] = array[index - 1];
                index--;
            }
            // Insert the element
            array[index] = next;
        }
    }
}

