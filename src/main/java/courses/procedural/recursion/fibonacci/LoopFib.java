package courses.procedural.recursion.fibonacci;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * This program computes Fibonacci numbers using an iterative method.
 */
public class LoopFib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            BigInteger f = fib(i);
            System.out.println("fib(" + i + ") = " + f);
        }
    }

    /**
     * Computes a Fibonacci number.
     *
     * @param n an integer
     * @return the nth Fibonacci number
     */
    public static BigInteger fib(int n) {
        if (n <= 2) {
            return new BigInteger("1");
        }

        BigInteger olderValue = new BigInteger("1");
        BigInteger oldValue = new BigInteger("1");
        BigInteger newValue = new BigInteger("1");

        for (int i = 3; i <= n; i++) {
            newValue = oldValue.add(olderValue);
            olderValue = oldValue;
            oldValue = newValue;
        }
        return newValue;
    }
}

