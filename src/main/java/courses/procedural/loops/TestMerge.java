package courses.procedural.loops;

import java.util.Arrays;

class Merger {
    /*public static int[] merge(int[] a, int[] b) { // wrong!
        int[] result.txt = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        while (aIndex + bIndex != result.txt.length) {
            if (a[aIndex] < b[bIndex]) {
                result.txt[aIndex + bIndex] = a[aIndex++];
            } else {
                result.txt[aIndex + bIndex] = b[bIndex++];
            }
        }
        return result.txt;
    }*/

    public static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int iFirst = 0; // Next element to consider in the first array
        int iSecond = 0; // Next element to consider in the second array
        int j = 0; // Next open position in result.txt

        // As long as neither iFirst nor iSecond is past the end, move
        // the smaller element into result.txt
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[j] = first[iFirst];
                iFirst++;
            } else {
                result[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }

        // Note that only one of the two loops below copies entries
        // Copy any remaining entries of the first array
        while (iFirst < first.length) {
            result[j] = first[iFirst];
            iFirst++;
            j++;
        }
        // Copy any remaining entries of the second half
        while (iSecond < second.length) {
            result[j] = second[iSecond];
            iSecond++;
            j++;
        }
        return result;
    }
}

public class TestMerge {
    public static void main(String[] args) {
        int[][][] testData = {
                {{}, {}},
                {{0}, {}},
                {{}, {0}},
                {{0}, {0}},
                {{0, 2}, {1, 3}},
                {{0, 2, 7, 9, 123}, {1, 3, 4, 5, 6}},
        };

        for (int[][] origin : testData) {
            int[] left = origin[0];
            int[] right = origin[1];
            int[] merged = Merger.merge(left, right);

            System.out.println(
                    Arrays.toString(left) +
                            " + " +
                            Arrays.toString(right) +
                            " -> " +
                            Arrays.toString(merged));
            System.out.println();
        }
    }
}
