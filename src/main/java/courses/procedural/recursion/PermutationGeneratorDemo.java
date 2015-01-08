package courses.procedural.recursion;

import courses.procedural.util.PermutationGenerator;

import java.util.ArrayList;

public class PermutationGeneratorDemo {
    private static int counter = 1;

    public static void main(String[] args) {
        PermutationGenerator generator = new PermutationGenerator("123");

        ArrayList<String> permutations = generator.getPermutations();
        for (String str : permutations) {
            System.out.println(counter++ + " - " + str);
        }
    }
}
