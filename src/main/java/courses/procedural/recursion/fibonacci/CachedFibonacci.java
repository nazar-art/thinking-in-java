package courses.procedural.recursion.fibonacci;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CachedFibonacci {
    private static Map<BigDecimal, BigDecimal> previousValuesHolder;
    static {
        previousValuesHolder = new HashMap<>();
        previousValuesHolder.put(BigDecimal.ZERO, BigDecimal.ZERO);
        previousValuesHolder.put(BigDecimal.ONE, BigDecimal.ONE);
    }

    private static LoadingCache<BigDecimal, BigDecimal> cachedFibonacci = CacheBuilder.newBuilder()
            .expireAfterWrite(5, TimeUnit.MINUTES)
            .maximumSize(5000000)
            .concurrencyLevel(5)
//            .weakKeys()
            .build(new CacheLoader<BigDecimal, BigDecimal>() {
                @Override
                public BigDecimal load(BigDecimal key) throws Exception {
                    return getFibonacciByKey(key);
                }
            });

    private static BigDecimal getFibonacciByKey(BigDecimal key) {
        long number = key.longValue();

        BigDecimal olderValue = BigDecimal.ONE,
                oldValue = BigDecimal.ONE,
                newValue = BigDecimal.ONE;

        for (int i = 3; i <= number; i++) {
            newValue = oldValue.add(olderValue);
            olderValue = oldValue;
            oldValue = newValue;
        }
        return newValue;
    }

    public static BigDecimal getGuavaCache(long number) {
        if (0 == number) {
            return BigDecimal.ZERO;
        } else if (1 == number) {
            return BigDecimal.ONE;
        } else {
            return cachedFibonacci.getUnchecked(BigDecimal.valueOf(number));
        }
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
                BigDecimal fibo = getIterativeFibonacci(inputNumber);
//                BigDecimal fibo = getFibonacciDynamic(inputNumber);
//                BigDecimal fibo = getCachedFibonacciOf(inputNumber);
//                BigDecimal fibo = getGuavaCache(inputNumber);

                long endTime = System.nanoTime();
                long delta = endTime - beginTime;

                System.out.printf("F(%d) = %.10s ... computed in %,d ms\n", inputNumber, fibo, delta / 1_000_000);
                System.out.printf("Number of digits %d\n", getFibosLents(fibo));
            } else {
                System.err.println("You must enter number > 0");
                System.out.println("try, enter number again, please:");
                break;
            }
        }
    }

    private static int getFibosLents(BigDecimal fibo) {
        return String.valueOf(fibo).length();
    }
}
