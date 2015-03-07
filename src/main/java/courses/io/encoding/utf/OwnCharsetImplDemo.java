package courses.io.encoding.utf;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class OwnCharsetImplDemo {
    public static void main(String[] args) {
        oneByteUtf();
        System.out.println();
        twoByteUtf();
        System.out.println();
        threeByteUtf();
        System.out.println();
        fourByteUtf();
    }

    private static void fourByteUtf() {
        int codePoint = 0b110011001100110011;
        String cp = leftZeroPadding(Integer.toBinaryString(codePoint), 32);
        System.out.print("codePoint: ");
        System.out.print(cp.substring(0, 8));
        System.out.print(".");
        System.out.print(cp.substring(8, 16));
        System.out.print(".");
        System.out.print(cp.substring(16, 24));
        System.out.print(".");
        System.out.print(cp.substring(24));
        System.out.println();

        String str = new String(new int[]{codePoint}, 0, 1);
        byte[] utf8bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.print("utf8bytes: ");
        System.out.print(leftZeroPadding(Integer.toBinaryString(0xFF & utf8bytes[0]), 8));
        System.out.print(".");
        System.out.print(leftZeroPadding(Integer.toBinaryString(0xFF & utf8bytes[1]), 8));
        System.out.print(".");
        System.out.print(leftZeroPadding(Integer.toBinaryString(0xFF & utf8bytes[2]), 8));
        System.out.print(".");
        System.out.println(leftZeroPadding(Integer.toBinaryString(0xFF & utf8bytes[3]), 8));

        showChars(codePoint, utf8bytes);
    }

    private static void threeByteUtf() {
        int codePoint = 0b11001100110011;
        String cp = leftZeroPadding(Integer.toBinaryString(codePoint), 24);
        System.out.print("codePoint: ");
        System.out.print(cp.substring(0, 8));
        System.out.print(".");
        System.out.print(cp.substring(8, 16));
        System.out.print(".");
        System.out.print(cp.substring(16));
        System.out.println();

        String str = new String(new int[]{codePoint}, 0, 1);
        byte[] utf8bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.print("utf8bytes: ");
        System.out.print(leftZeroPadding(Integer.toBinaryString(0xFF & utf8bytes[0]), 8));
        System.out.print(".");
        System.out.print(leftZeroPadding(Integer.toBinaryString(0xFF & utf8bytes[1]), 8));
        System.out.print(".");
        System.out.println(leftZeroPadding(Integer.toBinaryString(0xFF & utf8bytes[2]), 8));

        showChars(codePoint, utf8bytes);
    }

    private static void twoByteUtf() {
        int codePoint = 0b1100110011;
        String cp = leftZeroPadding(Integer.toBinaryString(codePoint), 16);
        System.out.print("codePoint: ");
        System.out.print(cp.substring(0, 8));
        System.out.print(".");
        System.out.print(cp.substring(8));
        System.out.println();

        String str = new String(new int[]{codePoint}, 0, 1);
        byte[] utf8bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.print("utf8bytes: ");
        System.out.print(leftZeroPadding(Integer.toBinaryString(0xFF & utf8bytes[0]), 8));
        System.out.print(".");
        System.out.println(leftZeroPadding(Integer.toBinaryString(0xFF & utf8bytes[1]), 8));

        showChars(codePoint, utf8bytes);
    }

    private static void oneByteUtf() {
        int codePoint = 0b110011;
        String cp = leftZeroPadding(Integer.toBinaryString(codePoint), 8);
        System.out.print("codePoint: ");
        System.out.print(cp);
        System.out.println();

        String str = new String(new int[]{codePoint}, 0, 1);
        byte[] utf8bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.print("utf8bytes: ");
        System.out.println(leftZeroPadding(Integer.toBinaryString(0xFF & utf8bytes[0]), 8));

        showChars(codePoint, utf8bytes);
    }

    public static String leftZeroPadding(String str, int len) {
        while (str.length() < len) {
            str = "0" + str;
        }
        return str;
    }

    private static void showChars(int codePoint, byte[] utf8bytes) {
        System.out.printf("%s - bytes representation (UTF-8)\n", Arrays.toString(utf8bytes));
        char[] chars = Character.toChars(codePoint);
        System.out.printf("%s - chars looking (UTF-16)\n", Arrays.toString(chars));
        System.out.printf("%s - real looking\n", new String(chars));
    }
}
