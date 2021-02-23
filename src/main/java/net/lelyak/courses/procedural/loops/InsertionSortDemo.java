package net.lelyak.courses.procedural.loops;

import net.lelyak.courses.procedural.util.ArrayUtil;
import net.lelyak.courses.procedural.util.BinarySearcher;
import net.lelyak.courses.procedural.util.InsertionSorter;
import net.lelyak.courses.procedural.util.StopWatch;

import java.util.Arrays;

class InsertionSort {

    /*public void sort() {
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
    }*/

    public static void sort(int[] array) {
        for (int border = 1; border < array.length; border++) {
            int newElement = array[border];
            int location = border - 1;
            while (location >= 0 && array[location] > newElement) {
                array[location + 1] = array[location];
                location--;
            }
            array[location + 1] = newElement;
        }
    }
}

public class InsertionSortDemo {
    public static void main(String[] args) {
//        easyTest();
//        testBinarySearchByHorstmann();
        int[] array = ArrayUtil.randomIntArray(3000, 1000);
        System.out.println(Arrays.toString(array));

        StopWatch timer = new StopWatch();
        timer.start();
        new InsertionSorter(array).sort();
        InsertionSort.sort(array);
        timer.stop();
        System.out.println(Arrays.toString(array));
        System.out.println("Elapsed time: " + timer.getElapsedTime() + " milliseconds");
    }

    private static void testBinarySearchByHorstmann() {
        int[] a = ArrayUtil.randomIntArray(60, 100);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        BinarySearcher searcher = new BinarySearcher(a);
        int number = 20;
        int pos = searcher.search(number);
        System.out.println("Found in position " + pos);
    }

    private static void easyTest() {
        int[][] data = {
                {},
                {1},
                {0, 3, 2, 1},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " -> ");
            InsertionSort.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
