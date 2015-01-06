package courses.procedural.util;

/**
 * This class sorts an array, using the selection sort
 * algorithm
 */
public class SelectionSorter {

    private int[] array;

    /**
     * Constructs a selection sorter.
     *
     * @param anArray the array to sort
     */
    public SelectionSorter(int[] anArray) {
        array = anArray;
    }

    /**
     * Sorts the array managed by this selection sorter.
     */
    public void sort() {
        for (int i = 0; i < array.length - 1; i++) {
            int minPos = minimumPosition(i);
            swap(minPos, i);
        }
    }

    /**
     * Finds the smallest element in a tail range of the array.
     *
     * @param from the first position in a to compare
     * @return the position of the smallest element in the
     * range a[from] . . . a[a.length - 1]
     */
    private int minimumPosition(int from) {
        int minPos = from;
        for (int i = from + 1; i < array.length; i++)
            if (array[i] < array[minPos]) minPos = i;
        return minPos;
    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

