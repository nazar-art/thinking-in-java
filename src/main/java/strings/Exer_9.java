package strings;

import java.util.Arrays;

/*
 * Exercise 9: (4) 
 * Using the documentation for java.util.regex.Pattern as a resource,
 	replace all the vowels in Splitting.knights with underscores.
 */

class Splitting {
    public static String knights = "Then, when you have found the shrubbery, you must "
            + "cut down the mightiest tree in the forest... "
            + "with... a herring!";

    public static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }
    // public static void main(String[] args) {
    // split(" "); // Doesn't have to contain regex chars
    // split("\\W+"); // Non-word characters
    // split("n\\W+"); // 'n' followed by non-word characters
    // }
}

public class Exer_9 {
    public static void main(String[] args) {
        System.out.println(Splitting.knights.replaceAll("[eaouei]", "_"));
    }
}
