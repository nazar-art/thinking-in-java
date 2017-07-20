package courses.procedural.jenkins;

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

    public static void main(String[] args) {
        for (String first : arr_1) {
            for (String second : arr_2) {
                System.out.println(PREFIX + first + second + ENDING);
            }
            for (String second : arr_3) {
                System.out.println(PREFIX + first + second + ENDING);
            }
        }
    }

}
