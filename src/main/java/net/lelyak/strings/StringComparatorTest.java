package net.lelyak.strings;

import static net.lelyak.strings.StringComparator.compareByOleander;
import static net.lelyak.strings.StringComparator.compareStrings;

final class StringComparator {

    private StringComparator() {
    }

    public static int compareByOleander(String str1, String str2) {
        int l1 = str1.length();
        int s1 = 0;
        for (int i = 0; i < l1; i++) {
            s1 = s1 + str1.charAt(i);
        }

        int l2 = str2.length();
        int s2 = 0;
        for (int i = 0; i < l2; i++) {
            s2 = s2 + str2.charAt(i);

        }
        return s1 - s2;
    }

    public static int compareStrings(String first, String second) {
        int lengthFirst = first.length();
        int lengthSecond = second.length();
        int lengthLimit = Math.min(lengthFirst, lengthSecond);

        char arrOne[] = first.toCharArray();
        char arrTwo[] = second.toCharArray();

        for (int i = 0; i < lengthLimit; i++) {
            char ch1 = arrOne[i];
            char ch2 = arrTwo[i];

            if (ch1 != ch2) {
                return ch1 - ch2;
            }
        }

        return lengthFirst - lengthSecond;
    }
}

public class StringComparatorTest {
    public static void main(String[] args) {
        String str1 = "1test1";
        String str2 = "test2dd";
        String str3 = "1test1";


        int result1 = compareByOleander(str1, str2);
        int result2 = compareByOleander(str1, str3);
        System.out.println("Compare by Sasha:");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println("Original:");
        System.out.println(str1.compareTo(str2));

        System.out.println();

        int result3 = compareStrings(str1, str2);
        int result4 = compareStrings(str1, str3);
        System.out.println("Compare by Nazar:");
        System.out.println(result3);
        System.out.println(result4);
        System.out.println("Original:");
        System.out.println(str1.compareTo(str2));

    }
}

/**
 * Compare by Sasha:
 * -152
 * 0
 * Original:
 * -67
 * <p/>
 * Compare by Nazar:
 * -67
 * 0
 * Original:
 * -67
 */
