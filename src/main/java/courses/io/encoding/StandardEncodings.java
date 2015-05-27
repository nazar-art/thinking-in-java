package courses.io.encoding;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StandardEncodings {
    public static void main(String[] args) {
        Charset utf8 = StandardCharsets.UTF_8;
        Charset utf16 = StandardCharsets.UTF_16;
        Charset usAscii = StandardCharsets.US_ASCII;
        Charset iso88591 = StandardCharsets.ISO_8859_1;
        Charset utf16be = StandardCharsets.UTF_16BE;
        Charset utf16le = StandardCharsets.UTF_16LE;
    }
}
