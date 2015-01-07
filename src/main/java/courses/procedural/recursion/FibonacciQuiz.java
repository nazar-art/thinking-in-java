package courses.procedural.recursion;

public class FibonacciQuiz {

    public static void main(String[] args) {
        f(5);
        System.out.println();
        fibonacciCompact(5);
    }

    public static int f(int x) {
        System.out.print(" " + x);
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else {
            return f(x - 2) + f(x - 1);
        }
    }

    public static int fibonacciCompact(int x) {
        System.out.print(" " + x);
        return (x < 2) ? x : f(x - 2) + f(x - 1);
    }
}