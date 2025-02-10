package net.lelyak.courses.procedural.util;

/**
 * A class for executing binary searches through an array.
 */
public class BinarySearcher {
    private int[] array;

    /**
     * Constructs a BinarySearcher.
     *
     * @param anArray a sorted array of integers
     */
    public BinarySearcher(int[] anArray) {
        array = anArray;
    }

    /**
     * Finds a value in a sorted array, using the binary
     * search algorithm.
     *
     * @param value the value to search
     * @return the index at which the value occurs, or -1
     * if it does not occur in the array
     */
    public int search(int value) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int diff = array[mid] - value;

            if (diff == 0) // a[mid] == value
                return mid;
            else if (diff < 0) // a[mid] < value
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -(low + 1);
    }
}


