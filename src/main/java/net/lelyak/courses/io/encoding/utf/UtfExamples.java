package net.lelyak.courses.io.encoding.utf;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class UtfExamples {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println(Arrays.toString("A".getBytes(StandardCharsets.UTF_8)));
        System.out.println(Arrays.toString("A".getBytes(StandardCharsets.UTF_16)));
        System.out.println(Arrays.toString("A".getBytes(StandardCharsets.UTF_16BE)));
        System.out.println(Arrays.toString("A".getBytes(StandardCharsets.UTF_16LE)));
        System.out.println(Arrays.toString("A".getBytes("UTF-32")));
        System.out.println(Arrays.toString("A".getBytes("UTF-32BE")));
        System.out.println(Arrays.toString("A".getBytes("UTF-32LE")));
    }
}
