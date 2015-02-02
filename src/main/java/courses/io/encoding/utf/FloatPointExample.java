package courses.io.encoding.utf;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class FloatPointExample {
    public static void main(String[] args) throws UnsupportedEncodingException {
        char ch;
        ch = 0x0001;
        System.out.println(Arrays.toString(("" + ch).getBytes("UTF-8")));
        ch = 0x0111;
        System.out.println(Arrays.toString(("" + ch).getBytes("UTF-8")));
        ch = 0x1111;
        System.out.println(Arrays.toString(("" + ch).getBytes("UTF-8")));
    }
}
