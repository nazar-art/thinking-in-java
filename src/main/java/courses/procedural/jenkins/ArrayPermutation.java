package courses.procedural.jenkins;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ArrayPermutation {

    private static final String PREFIX = "ignore(FAILURE) { build(\"tsm-edge-load\", ";
    public static final String ENDING = ")}";

    private static String[] arr_1 = new String[]{
            "111",
            "222",
            "333"};

    private static String[] arr_2 = new String[]{
            "aaa",
            "bbb",
            "ccc"};

    private static String[] arr_3 = new String[]{
            "***",
            "&&&",
            "$$$"};

    public static List<String> getCombinations(String prefix, String ending, String[]... arrays) {
        List<String> results = new ArrayList<>();
        Stack<String[]> combinations = new Stack<>();
        combinations.add(new String[arrays.length]);

        while (!combinations.isEmpty()) {
            String[] currentArray = combinations.pop();

            boolean complete = true;
            for (int i = 0; i < arrays.length; i++) {
                if (currentArray[i] == null) {
                    complete = false;
                    for (int j = 0; j < arrays[i].length; j++) {
                        String[] newArray = currentArray.clone();
                        newArray[i] = arrays[i][j];
                        combinations.add(newArray);
                    }
                }
            }

            if (complete) {
                StringBuilder stringBuilder = new StringBuilder(prefix);
                for (String string : currentArray) {
                    stringBuilder.append(string);
                }
                stringBuilder.append(ending);
                results.add(stringBuilder.toString());
            }
        }

        return results;
    }

    public static void main(String[] args) {
        List<String> permutations = getCombinations(PREFIX, ENDING, arr_1, arr_2, arr_3);

        permutations.stream()
                .distinct()
                .forEach(System.out::println);
    }

}
