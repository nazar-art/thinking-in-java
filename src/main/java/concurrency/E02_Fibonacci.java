package concurrency;

/****************** Exercise 2 *****************
 * Following the form of generics/Fibonacci.java,
 * create a task that produces a sequence of n
 * Fibonacci numbers, where n is provided to the
 * constructor of the task. Create a number of these
 * tasks and drive them using threads.
 *
 * Exercise 4: (1) Repeat Exercise 2 using the different types of executors shown in this
 * 	section.
 ***********************************************/

import generics.Generator;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Fibonacci implements Generator<Integer>, Runnable {

    private int count;
    private final int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2)
            return 1;
        return fib(n - 2) + fib(n - 1);
    }

    public void run() {
        Integer[] sequence = new Integer[n];

        for (int i = 0; i < n; i++)
            sequence[i] = next();

        System.out.println("Seq. of " + n + ": " + Arrays.toString(sequence));
    }
}

public class E02_Fibonacci {

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service = Executors.newFixedThreadPool(5);
        service = Executors.newSingleThreadExecutor();

        for (int i = 1; i <= 5; i++) {
            //new Thread(new Fibonacci(i)).start();
            service.execute(new Fibonacci(i));
        }
    }
}
