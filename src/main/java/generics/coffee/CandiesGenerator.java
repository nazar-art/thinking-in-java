package generics.coffee;

import generics.Generator;

import java.util.Iterator;
import java.util.Random;

public class CandiesGenerator implements Generator<Sweets>, Iterable<Sweets> {
    @SuppressWarnings("rawtypes")
    private Class[] types = {Latte.class, Mocha.class, Cappuccino.class,
            Americano.class, Breve.class,};
    private static Random rand = new Random(47);

    public CandiesGenerator() {
    }

    // For iteration:
    private int size = 0;

    public CandiesGenerator(int sz) {
        size = sz;
    }

    public Sweets next() {
        try {
            return (Sweets) types[rand.nextInt(types.length)].newInstance();
            // Report programmer errors at run time:
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Sweets> {
        int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        public Sweets next() {
            count--;
            return CandiesGenerator.this.next();
        }

        public void remove() { // Not implemented
            throw new UnsupportedOperationException();
        }
    }

    ;

    public Iterator<Sweets> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CandiesGenerator gen = new CandiesGenerator();
        for (int i = 0; i < 5; i++)
            System.out.println(gen.next());
        for (Sweets c : new CandiesGenerator(5))
            System.out.println(c);
    }
}