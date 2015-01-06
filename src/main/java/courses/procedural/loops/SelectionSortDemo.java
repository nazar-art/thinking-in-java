package courses.procedural.loops;

import courses.procedural.util.ArrayUtil;
import courses.procedural.util.SelectionSorter;
import courses.procedural.util.StopWatch;

import java.util.Arrays;

class SelectionSort {
    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[barrier] > arr[index]) {
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
                }
            }
        }
    }

    public static void sort_2(int[] array) {
        for (int barrier = 0; barrier < array.length - 1; barrier++) {
            int minIndex = barrier;
            for (int index = barrier + 1; index < array.length; index++) {
                if (array[minIndex] > array[index]) {
                    minIndex = index;
                }
            }
            int tmp = array[minIndex];
            array[minIndex] = array[barrier];
            array[barrier] = tmp;
        }
    }
}

public class SelectionSortDemo {
    public static void main(String[] args) {
//        easyTest();
        int[] data = ArrayUtil.randomIntArray(8086, 1000);

        // Use stopwatch to time selection sort

        StopWatch timer = new StopWatch();
        timer.start();
//        SelectionSort.sort(data);
//        SelectionSort.sort_2(data);
        new SelectionSorter(data).sort();
        timer.stop();
        System.out.println("Elapsed time: " + timer.getElapsedTime() + " milliseconds");
        timer.reset();
    }

    private static void easyTest() {
        int[][] data = {
                {},
                {1},
                {2, 1},
                {4, 6, 2},
                {0, 3, 2, 1},
                {6, 8, 3, 100, 5, 4, 1, 2, 0, 9, 7},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " -> ");
            SelectionSort.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
