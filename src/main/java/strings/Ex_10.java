package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex_10 {

    public static void main(String[] args) {
        String source = "Java now has regular expressions";
        String[] regEx = {"^Java", "\\Breg.*", "n.w\\s+h(a|i)s", "s?", "s*",
                "s+", "s{4}", "S{1}.", "s{0,3}"};

        for (String pattern : regEx) {
            System.out.println("Regular expression: \"" + pattern + "\"");
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(source);
            while (m.find()) {
                System.out.println("Match \"" + m.group() + "\" at positions "
                        + m.start() + "-" + (m.end() - 1));
            }
            System.out.println();
        }
    }
}
