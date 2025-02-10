package net.lelyak.courses.procedural.loops;

import java.util.Arrays;

import static net.lelyak.mindview.util.Print.print;
import static net.lelyak.mindview.util.Print.printnb;

public class SwapDemo {
    public static void main(String[] args) {
        int data[] = {11, 0, 8, 9, 2, 15, 6, 7, 4, 5, 3};

/*
        for (int k = 0; k < data.length - 1; k++) {
//            swap(data, k, k + 1);
//            conditionalSwap(data, k, k + 1);
        }
*/
        bubbleSortFromLowest(data);
        bubbleSortFromHighest(data);
    }

    public static void swap(int[] data, int first, int second) {
        int tmp = data[first];
        data[first] = data[second];
        data[second] = tmp;
    }

    public static void conditionalSwap(int[] array, int fst, int snd) {
        if (array[fst] > array[snd]) {
            int tmp = array[fst];
            array[fst] = array[snd];
            array[snd] = tmp;
        }
    }

    public static void bubbleSortFromLowest(int[] array) {
        System.out.println("SwapDemo.bubbleSortFromLowest");
        printnb(Arrays.toString(array) + " -> ");
        for (int barrier = array.length - 1; barrier > 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (array[index] > array[index + 1]) {
                    int tmp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = tmp;
                }
            }
        }
        print(Arrays.toString(array));
    }

    public static void bubbleSortFromHighest(int[] array) {
        System.out.println("SwapDemo.bubbleSortFromHighest");
        printnb(Arrays.toString(array) + " -> ");
        for (int barrier = 1; barrier <= array.length; barrier++) {
            for (int index = array.length - 1; index >= barrier; index--) {
                if (array[index] > array[index - 1]) {
                    int tmp = array[index - 1];
                    array[index - 1] = array[index];
                    array[index] = tmp;
                }
//                print(Arrays.toString(array));
            }
        }
        print(Arrays.toString(array));
    }
}
