package courses;

import java.util.Arrays;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

public class InverterDemo {
    public static void invertArray(int[] data) {
        for (int k = 0; k < data.length / 2; k++) {
            int tmp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = tmp;
        }
    }

    public static void invertArrayRec(int[] data) {
        invertArrayRec(data, 0);
    }

    public static void invertArrayRec(int[] data, int point) {
        if (point < data.length / 2) {
            for (int k = 0; k < data.length / 2; k++) {
                int tmp = data[k];
                data[k] = data[data.length - 1 - k];
                data[data.length - 1 - k] = tmp;
                invertArrayRec(data, point + 1);
            }
        }
    }

    public static String invertString(String string) {
        char[] data = string.toCharArray();
        for (int k = 0; k < data.length / 2; k++) {
            char tmp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = tmp;
        }
        return new String(data);
    }

    private static void testInvert(int [] data) {
        printnb(Arrays.toString(data) + " -> ");
        invertArray(data);
        print(Arrays.toString(data));
    }

    private static void testStringInvert(String string) {
        printnb(string + " -> ");
        string = invertString(string);
        print(string);
    }

    public static void main(String[] args) {
        testInvert(new int[]{});
        testInvert(new int[]{0, 1});
        testInvert(new int[]{0, 1, 2, 3, 4});
        testInvert(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        testStringInvert("Hello");
        testStringInvert("Hello world !!");
        testStringInvert("Hello Nazar! How are you?");
    }
}
