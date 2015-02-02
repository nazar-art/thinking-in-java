package courses.io.encoding.utf;

import java.nio.charset.StandardCharsets;

public class OwnCharsetImplDemo {
    public static void main(String[] args) {
        oneByteUtf();
        twoByteUtf();
        threeByteUtf();
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
        System.out.print(leftZeroPadding(Integer.toBinaryString(0xFF & utf8bytes[3]), 8));
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
    }

    public static String leftZeroPadding(String str, int len) {
        while (str.length() < len) {
            str = "0" + str;
        }
        return str;
    }
}
