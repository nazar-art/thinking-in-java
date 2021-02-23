package net.lelyak.courses.io.encoding.utf;

public class HugeCodePoint {
    public static void main(String[] args) {
        char ch0 = 55378;
        char ch1 = 56816;
        char[] chars = {ch0, ch1};
        String str = new String(chars);
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.codePointCount(0, chars.length));
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
    }
}
