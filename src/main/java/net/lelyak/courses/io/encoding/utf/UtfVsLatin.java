package net.lelyak.courses.io.encoding.utf;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class UtfVsLatin {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String russianLetters = "ЭЮЯ";
        System.out.println(russianLetters.getBytes(StandardCharsets.UTF_8).length);
        System.out.println(russianLetters.getBytes("latin1").length);

        System.out.println(Arrays.toString(russianLetters.getBytes(StandardCharsets.UTF_8)));
    }
}
