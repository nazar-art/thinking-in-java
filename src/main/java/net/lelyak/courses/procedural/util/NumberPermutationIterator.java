package net.lelyak.courses.procedural.util;

import java.util.Arrays;

public class NumberPermutationIterator {
    public static final int PERMUTE_NUMBER = 3;
    private int[] array;

    public NumberPermutationIterator(int number) {
        array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = i;
        }
    }

    public NumberPermutationIterator(int [] numberArray) {
        array = numberArray;
    }

    public int[] nextPermutation() {
        if (array.length <= 1) {
            return array;
        }
        for (int border = array.length - 1; border > 0; border--) {
            if (array[border - 1] < array[border]) {
                int index = array.length - 1;
                while (array[border - 1] > array[index]) index--;
                swap(border - 1, index);
                reverse(border, array.length - 1);
                return array;
            }
        }
        return array;
    }

    public boolean hasMorePermutations() {
        if (array.length <= 1) {
            return false;
        }
        for (int index = array.length - 1; index > 0; index--) {
            if (array[index - 1] < array[index]) {
                return true;
            }
        }
        return false;
    }

    public void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void reverse(int i, int j) {
        while (i < j) {
            swap(i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        NumberPermutationIterator permutationIterator = new NumberPermutationIterator(new int[]{1, 2, 3});
//        System.out.println("original number: " + PERMUTE_NUMBER);
        while (permutationIterator.hasMorePermutations()) {
            int[] ints = permutationIterator.nextPermutation();
            System.out.println(Arrays.toString(ints));
        }
    }

}