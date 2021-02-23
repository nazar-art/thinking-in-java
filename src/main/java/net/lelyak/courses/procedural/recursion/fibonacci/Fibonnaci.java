package net.lelyak.courses.procedural.recursion.fibonacci;

import java.util.Scanner;

public class Fibonnaci {

    public static long getFibonnaciOf(long n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return getFibonnaciOf(n - 2) + getFibonnaciOf(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter n :");
            long n = scanner.nextLong();
            if (n >= 0) {
                long beginTime = System.currentTimeMillis();
                long fibo = getFibonnaciOf(n);
                long endTime = System.currentTimeMillis();

                long delta = endTime - beginTime;

                System.out.println("F(" + n + ") = " + fibo + " ... computed     in " + delta + " milliseconds");
            } else {
                break;

            }
        }

    }
}
