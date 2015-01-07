package courses.procedural.recursion;

public class FibonacciQuizWithRotation {
    public static void main(String[] args) {
        f(5);
    }
    public static int f(int x) {
        System.out.print(" " + x);
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else if (x % 2 == 0) {
            return f(x - 2) + f(x - 1);
        } else {
            return f(x - 1) + f(x - 2);
        }
    }
}
