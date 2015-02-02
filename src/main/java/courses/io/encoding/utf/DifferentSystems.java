package courses.io.encoding.utf;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class DifferentSystems {
    public static void main(String[] args) {
        System.out.println("16: " + Integer.toHexString(Character.MAX_VALUE));
        System.out.println("10: " + Integer.toString(Character.MAX_VALUE));
        System.out.println("8:  " + Integer.toOctalString(Character.MAX_VALUE));
        System.out.println("2:  " + Integer.toBinaryString(Character.MAX_VALUE));

        System.out.println(Charset.defaultCharset());

        Charset iso88591 = StandardCharsets.ISO_8859_1;
        System.out.println(iso88591.name());
        System.out.println(iso88591.aliases());
        System.out.println(iso88591.aliases().size());
    }
}
