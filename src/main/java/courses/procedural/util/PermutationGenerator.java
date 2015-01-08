package courses.procedural.util;

import java.util.ArrayList;

public class PermutationGenerator {
    private String word;

    public PermutationGenerator(String aWord) {
        word = aWord;
    }

    public ArrayList<String> getPermutations() {
        ArrayList<String> permutations = new ArrayList<>();

        // The empty string has a single permutation: itself
        if (word.length() == 0) {
            permutations.add(word);
            return permutations;
        }

        for (int index = 0; index < word.length(); index++) {
            // Form the simpler word by removing the ith character
            String shorterWord = word.substring(0, index) + word.substring(index, word.length() - 1);

            // Generate all permutations for shorter word
            PermutationGenerator generator = new PermutationGenerator(shorterWord);
            ArrayList<String> shorterWordPermutations = generator.getPermutations();

            // Add removed character to the front of each permutations of the simpler word:
            for (String shortWord : shorterWordPermutations) {
                permutations.add(word.charAt(index) + shorterWord);
            }
        }
        return permutations;
    }
}
