package net.lelyak.strings;

import java.util.Arrays;

/**
 * ***************
 * Exercise 6 ****************** Exercise 7: (5) Using the documentation for
 * java.util.regex.Pattern as a resource, write and test a regular expression
 * that checks a sentence to see that it begins with a capital letter and ends
 * with a period.
 * **********************************************
 */

public class Exer_7 {
    public static boolean matche(String text) {
        return text.matches("\\p{javaUpperCase}.*\\.");
    }

    public static String frase = "Hello guys! I want to say to you. I love you all!"
            + "Let's fo party all night";

    public static void split(String regex) {
        System.out.println(Arrays.toString(frase.split(regex)));
    }

    public static void main(String[] args) {
        //split("^[A-Z]$.");
        System.out.println(matche("This is correct sentence."));
        System.out.println(matche("not very well sentence."));
        System.out.println(matche("very bad"));
        System.out.println(matche("I love you all...."));
    }
}
