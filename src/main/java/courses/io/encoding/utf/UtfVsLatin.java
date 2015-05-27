package courses.io.encoding.utf;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class UtfVsLatin {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("ЭЮЯ".getBytes(StandardCharsets.UTF_8).length);
        System.out.println("ЭЮЯ".getBytes("latin1").length);
    }
}
