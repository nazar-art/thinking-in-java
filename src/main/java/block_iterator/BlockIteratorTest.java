package block_iterator;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @author Nazar Lelyak.
 */
class BlockIterator implements Iterator<List<String>> {

    private Matcher matcher;

    public BlockIterator(Iterator<String> lines, String regexp) {
        if (lines.hasNext()) {
            String line = lines.next();
            matcher = Pattern.compile(regexp).matcher(line);
        }
    }

    @Override
    public boolean hasNext() {
        return matcher.find();
    }

    @Override
    public List<String> next() {
        return null;
    }
}

public class BlockIteratorTest {

    public static final String[] lines = new String[]{"123", "- test -", "start", "end", "test123"};


}
