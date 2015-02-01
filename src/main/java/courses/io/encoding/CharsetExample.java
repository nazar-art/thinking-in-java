package courses.io.encoding;

public class CharsetExample {
    public static void main(String[] args) {
        printChar();
        printLong();
    }

    private static void printChar() {
        int intValue = 0xFFFF;
        char charValue = '\uFFFF';
        System.out.println(intValue);
        System.out.println((int) charValue);
    }

    private static void printLong() {
        short shortValue = -32768;
        System.out.println(Integer.toBinaryString(shortValue));
    }
}
