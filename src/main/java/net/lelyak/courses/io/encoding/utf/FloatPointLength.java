package net.lelyak.courses.io.encoding.utf;

import java.io.UnsupportedEncodingException;

public class FloatPointLength {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("A".getBytes("UTF-16").length);
        System.out.println("AA".getBytes("UTF-16").length);
    }
}
