package net.lelyak.concurrency;

import net.lelyak.generics.Generator;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * Exercise 5: (2) Modify Exercise 2 so that the task is a Callable that sums the values of
 *	all the Fibonacci numbers. Create several tasks and display the results.
 */

class Fibon implements Generator<Integer>, Callable<Integer> {

    private int count;
    private final int n;

    public Fibon(int n) {
        this.n = n;
    }

    @Override
    public Integer next() {
        return fib(count++);
    }

    private Integer fib(int i) {
        if (i < 2)
            return 1;
        return fib(i - 2) + fib(i - 1);
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += next();
        return sum;
    }

}

public class E05_FibonacciSum {

    public static void main(String[] args) {

        ExecutorService service = Executors.newCachedThreadPool();
        ArrayList<Future<Integer>> results = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            results.add(service.submit(new Fibon(i)));
        }

        for (Future<Integer> future : results) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            } finally {
                service.shutdown();
            }
        }
    }
}
