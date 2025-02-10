package net.lelyak.generics;

import java.util.Iterator;

/*
 * Exercise 7: (2) 
 * Use composition instead of inheritance to adapt Fibonacci to make it
 *	Iterable.
 */

class Fibonacci implements Generator<Integer> {
    private int count = 0;

    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2)
            return 1;
        return fib(n - 2) + fib(n - 1);
    }

}

public class IterableFibonacci implements Iterable<Integer> {
    private Fibonacci fib;
    private int n;

    public IterableFibonacci(int count) {
        fib = new Fibonacci();
        n = count;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                --n;
                return fib.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (int i : new IterableFibonacci(16)) {
            System.out.print(i + " ");
        }
    }
}
