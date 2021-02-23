package net.lelyak.courses.io.encoding.utf;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ConvertFromStringToUtf {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "Hello world!";
        System.out.println(Arrays.toString(str.getBytes(StandardCharsets.UTF_16LE)));
    }
}
