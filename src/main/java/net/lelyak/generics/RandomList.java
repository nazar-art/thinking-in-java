package net.lelyak.generics;

import java.util.ArrayList;
import java.util.Random;

/*
 * Exercise 6: (1) Use RandomList with two more types in addition to the one shown in
 main( ).
 */

public class RandomList<T> {
    private static void dump(RandomList<?> rl) {
        for (int i = 0; i < 11; i++)
            System.out.print(rl.select() + " ");
        System.out.println();
    }

    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<String>();
        for (String s : ("The quick brown fox jumped over "
                + "the lazy brown dog").split(" "))
            rs.add(s);
        dump(rs);

        RandomList<Integer> ri = new RandomList<Integer>();
        Generator<Integer> gi = new CountingGenerator.Integer();
        for (int i = 0; i < 11; i++)
            ri.add(gi.next());
        dump(ri);

        RandomList<Character> rc = new RandomList<Character>();
        Generator<Character> gc = new CountingGenerator.Character();
        for (int i = 0; i < 11; i++)
            rc.add(gc.next());
        dump(rc);

    }
}