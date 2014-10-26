package strings;

public class Check {
    private static boolean check(String str) {
        for (int i = 1; i < str.length(); i++) {
            String first = str.substring(i, i + 1);
            String beforeFirst = str.substring(i - 1, i);

            if (beforeFirst.compareTo(first) > 0) {
                return false;
            }
        }

        return true;
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Check obj = new Check();

        System.out.printf("abcdef is: %s%n", obj.check("abcdef"));
        System.out.printf("12345 is: %s%n", obj.check("12345"));
        System.out.printf("54321 is: %s%n", obj.check("54321"));
        System.out.printf("fedcba is: %s%n", obj.check("fedcba"));
    }
}
