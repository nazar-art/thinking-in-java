package courses.procedural.recursion;

import java.math.BigInteger;

public class FactorialDemo {
    public static void main(String[] args) {
        System.out.println(factorialIterative(5));
        System.out.println(factorialIterative(17));
        System.out.println(factorialSaveOut(40));
        System.out.println(factorialRecursive(5));
        System.out.println(factorialRecSimple(5));
    }

    public static int factorialIterative(int arg) {
        int result = 1;
        for (int k = 1; k <= arg; k++) {
            result *= k;
        }
        return result;
    }

    public static BigInteger factorialSaveOut(int arg) {
        BigInteger result = BigInteger.ONE;
        for (int k = 1; k <= arg; k++) {
            result = result.multiply(BigInteger.valueOf(k));
        }
        return result;
    }

    public static int factorialRecursive(int arg) {
        if (arg == 1) {
            return 1;
        } else {
            return arg * factorialRecursive(arg - 1);
        }
    }

    public static int factorialRecSimple(int arg) {
        return (arg == 1) ? 1 : arg * factorialRecSimple(arg - 1);
    }
}
