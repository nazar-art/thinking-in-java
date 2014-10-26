package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex_11 {

    public static void main(String[] args) {
        String source = "Arline ate eight apples and one orange while Anita hadn’t any";
        String regEx = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
        System.out.println(source);
        System.out.println("\nreg exp = \"" + regEx + "\"\n");
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(source);
        while (m.find()) {
            System.out.println("Match \"" + m.group() + "\" at position "
                    + m.start() + "-" + m.end());
        }
    }
}
