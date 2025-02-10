package net.lelyak.courses.io.encoding.utf;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class FloatPointExample {
    public static void main(String[] args) {
        char ch;
        ch = 0x0001;
        printValue(ch);
        ch = 0x0111;
        printValue(ch);
        ch = 0x1111;
        printValue(ch);
    }

    private static void printValue(char ch) {
        System.out.println(Arrays.toString((String.valueOf(ch)).getBytes(StandardCharsets.UTF_8)));
    }
}
