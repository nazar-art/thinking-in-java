package courses.procedural.recursion.fibonacci;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CachedFibonacci {
    private static Map<BigDecimal, BigDecimal> previousValuesHolder;
    static {
        previousValuesHolder = new HashMap<>();
        previousValuesHolder.put(BigDecimal.ZERO, BigDecimal.ZERO);
        previousValuesHolder.put(BigDecimal.ONE, BigDecimal.ONE);
    }

    public static BigDecimal getCachedFibonacciOf(long number) {
        if (0 == number) {
            return BigDecimal.ZERO;
        } else if (1 == number) {
            return BigDecimal.ONE;
        } else {
            if (previousValuesHolder.containsKey(BigDecimal.valueOf(number))) {
                return previousValuesHolder.get(BigDecimal.valueOf(number));
            } else {
                BigDecimal olderValue = BigDecimal.ONE,
                        oldValue = BigDecimal.ONE,
                        newValue = BigDecimal.ONE;

                for (int i = 3; i <= number; i++) {
                    newValue = oldValue.add(olderValue);
                    olderValue = oldValue;
                    oldValue = newValue;
                }
                previousValuesHolder.put(BigDecimal.valueOf(number), newValue);
                return newValue;
            }
        }
    }

    public static BigDecimal getIterativeFibonacci(long n) {
        if(n <= 1) {
            return BigDecimal.ONE;
        }
        BigDecimal first = BigDecimal.ONE, second = BigDecimal.ONE;
        BigDecimal result = BigDecimal.ZERO;
        for(int i = 2; i <= n; i++) {
            result = first.add(second);
            first = second;
            second = result;
        }
        return result;
    }

    public static BigDecimal getFibonacciDynamic(long n) {
        BigDecimal[] f = new BigDecimal[(int)(n + 1)];
        f[0] = BigDecimal.ZERO;
        f[1] = BigDecimal.ONE;
        for(int i = 2; i <= n; i++) {
            f[i] = f[i - 1].add(f[i - 2]);
        }
        return f[(int)n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter n: ");
            long inputNumber = scanner.nextLong();
            if (inputNumber >= 0) {
                long beginTime = System.nanoTime();
                BigDecimal fibo = getCachedFibonacciOf(inputNumber);
//                BigDecimal fibo = getIterativeFibonacci(inputNumber);
//                BigDecimal fibo = getFibonacciDynamic(inputNumber);
                long endTime = System.nanoTime();
                long delta = endTime - beginTime;

                System.out.printf("F(%d) = %.0f ... computed in %,d ms\n", inputNumber, fibo, delta / 1_000_000);
            } else {
                System.err.println("You must enter number > 0");
                System.out.println("try, enter number again, please:");
                break;
            }
        }
    }
}
