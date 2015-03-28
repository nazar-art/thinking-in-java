package courses.procedural.recursion.fibonacci;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CachedFibonacci {
    private static Map<BigInteger, BigInteger> previousValuesHolder;
    static {
        previousValuesHolder = new HashMap<>();
        previousValuesHolder.put(new BigInteger(String.valueOf(0)), new BigInteger(String.valueOf(0)));
        previousValuesHolder.put(new BigInteger(String.valueOf(1)), new BigInteger(String.valueOf(1)));
    }

    public static BigInteger getFibonacciOf(long number) {
        if (0 == number) {
            return new BigInteger(String.valueOf(0));
        } else if (1 == number) {
            return new BigInteger(String.valueOf(1));
        } else {
            if (previousValuesHolder.containsKey(BigInteger.valueOf(number))) {
                return previousValuesHolder.get(BigInteger.valueOf(number));
            } else {
                BigInteger olderValue = new BigInteger(String.valueOf(1));
                BigInteger oldValue = new BigInteger(String.valueOf(1));
                BigInteger newValue = new BigInteger(String.valueOf(1));

                for (int i = 3; i <= number; i++) {
                    newValue = oldValue.add(olderValue);
                    olderValue = oldValue;
                    oldValue = newValue;
                }
                previousValuesHolder.put(BigInteger.valueOf(number), newValue);
                return newValue;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter n: ");
            long inputNumber = scanner.nextLong();
            if (inputNumber >= 0) {
                long beginTime = System.currentTimeMillis();
                BigInteger fibo = getFibonacciOf(inputNumber);
                long endTime = System.currentTimeMillis();
                long delta = endTime - beginTime;

                System.out.printf("F(%d) = %d ... computed in %d milliseconds\n", inputNumber, fibo, delta);
            } else {
                System.err.println("You must enter number > 0");
                System.out.println("try, enter number again, please:");
                break;
            }
        }
    }
}
