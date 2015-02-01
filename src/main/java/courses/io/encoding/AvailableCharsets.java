package courses.io.encoding;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;

import static net.mindview.util.Print.print;

public class AvailableCharsets {
    public static void main(String[] args) {
        Map<String, Charset> map = Charset.availableCharsets();
        Set<String> charsetNames = map.keySet();
        print(charsetNames);
        print(charsetNames.size());
    }
}
