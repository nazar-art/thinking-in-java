package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

enum NumberType {
    ODD, EVEN
}

class OddEven {
    NumberType type;

    synchronized void printOdd(int n, boolean running) {
        if (!running) {
            type = NumberType.ODD;
            notify();
            return;
        }

        type = NumberType.ODD;
        if (n % 2 != 0) {
            System.out.println(Thread.currentThread().getName() + ": " + n);
        }
        notify();

        try {
            while (type != NumberType.EVEN) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("odd interrupted");
        }
    }

    synchronized void printEven(int n, boolean running) {
        if (!running) {
            type = NumberType.EVEN;
            notify();
            return;
        }

        type = NumberType.EVEN;
        if (n % 2 == 0) {
            System.out.println(Thread.currentThread().getName() + ": " + n);
        }
        notify();

        try {
            while (type != NumberType.ODD) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("even interrupted");
        }
    }
}

public class OddEvenNumberDemo {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        int numberLimit = 100;
        OddEven oddEven = new OddEven();
        Runnable task = () -> {
            for (int i = 1; i <= numberLimit; i++) {
                oddEven.printEven(i, true);
            }
            oddEven.printEven(numberLimit, false);
        };
        Runnable task2 = () -> {
            for (int i = 1; i <= numberLimit; i++) {
                oddEven.printOdd(i, true);
            }
            oddEven.printOdd(numberLimit, false);
        };

        executor.execute(task);
        executor.execute(task2);

        executor.shutdown();

    }
}
