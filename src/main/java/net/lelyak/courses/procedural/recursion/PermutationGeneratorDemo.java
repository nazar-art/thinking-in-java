package net.lelyak.courses.procedural.recursion;

import net.lelyak.courses.procedural.util.PermutationGenerator;

import java.util.ArrayList;

public class PermutationGeneratorDemo {
    public static final String WORD = "ABC";
    private static int counter = 1;

    public static void main(String[] args) {
//        PermutationGenerator generator = new PermutationGenerator(WORD);
//        ArrayList<String> permutations = generator.getPermutations();

        ArrayList<String> permutations = PermutationGenerator.permute(WORD);
        for (String str : permutations) {
            System.out.println(counter++ + " - " + str);
        }
    }
}
