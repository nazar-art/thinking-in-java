package courses.procedural.loops;

import java.util.Arrays;

class BubbleSorter {
    public static void bubbleSort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = arr.length - 2; index >= barrier; index--) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
            }
        }
    }

    public static void bubbleSorter_2(int[] arr) {
        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
            }
        }
    }
}

public class BubbleSorterDemo {
    public static void main(String[] args) {
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
//            BubbleSorter.bubbleSort(arr);
            BubbleSorter.bubbleSorter_2(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
