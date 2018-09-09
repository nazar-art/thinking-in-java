package courses.procedural.jenkins;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayPermutation {

    private static final String PREFIX = "ignore(FAILURE) { build(\"tsm-edge-load\", ";
    public static final String ENDING = ")}";

    private static final String FIRST_BUILD_PART = " KILL_CLUSTER: true, BUILD_CLUSTER: true, ";

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

    public static Set<String> getCombinations(String prefix, String ending, String[]... arrays) {
        Set<String> results = new HashSet<>();
        Stack<String[]> stack = new Stack<>();
        stack.add(new String[arrays.length]);

        while (!stack.isEmpty()) {
            String[] currentArray = stack.pop();

            boolean complete = true;
            for (int arrIndex = 0; arrIndex < arrays.length; arrIndex++) {
                if (currentArray[arrIndex] == null) {
                    complete = false;
                    for (int j = 0; j < arrays[arrIndex].length; j++) {
                        String[] newArray = currentArray.clone();
                        newArray[arrIndex] = arrays[arrIndex][j];
                        stack.add(newArray);
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
        Set<String> permutations = getCombinations(PREFIX, ENDING, arr_1, arr_2, arr_3);

        permutations.forEach(System.out::println);



    }

}
