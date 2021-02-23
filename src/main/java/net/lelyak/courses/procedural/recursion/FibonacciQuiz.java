package net.lelyak.courses.procedural.recursion;

public class FibonacciQuiz {

    public static final int BORDER_VALUE = 20;

    public static void main(String[] args) {
//        f(5);
//        System.out.println();
//        fibonacciCompact(40);
        for (int i = 1; i <= BORDER_VALUE; i++) {
            System.out.print(fibonacciLoop(i) + " ");
        }
        /*System.out.println();
        for (int i = 1; i <= BORDER_VALUE; i++) {
            System.out.print(fibonacciRec(i) + " ");
        }*/
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

    public static long fibonacciLoop(int value) {
        if (value <= 2) return 1;

        long olderValue = 1;
        long oldValue = 1;
        long newValue = 1;

        for (int i = 3; i <= value; i++) {
            newValue = olderValue + oldValue;
            olderValue = oldValue;
            oldValue = newValue;
        }
        return newValue;
    }

    public static long fibonacciRec(int value) {
        return (value <= 2) ? 1 : fibonacciRec(value - 2) + fibonacciRec(value - 1);
    }
}