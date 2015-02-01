package courses.io.encoding;

import java.util.Arrays;

public class TestCodePoint {
    public static void main(String[] args) {
        testCodePoint(65);
        testCodePoint(10_000);
        testCodePoint(50_000);
        testCodePoint(165_536);
    }

    private static void testCodePoint(int codePoint) {
        char[] chars = Character.toChars(codePoint);
        System.out.println("char[]: " + Arrays.toString(chars));
        String str = new String(chars);
        System.out.println("string: " + str);
        System.out.println("string.length: " + str.length());
        System.out.println("string.codePointCount: " + str.codePointCount(0, str.length()));
        System.out.println();
    }
}
