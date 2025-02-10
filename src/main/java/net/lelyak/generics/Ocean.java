package net.lelyak.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

class LittleFish {
    private static long counter;
    private final long id = counter++;

    private LittleFish() {
    }

    @Override
    public String toString() {
        return "Littlefish " + id;
    }

    public static Generator<LittleFish> generator() {
        return new Generator<LittleFish>() {

            @Override
            public LittleFish next() {
                return new LittleFish();
            }
        };
    }
}

class BigFish {
    private static long counter;
    private final long id = counter++;

    private BigFish() {
    }

    @Override
    public String toString() {
        return "BigFish " + id;
    }

    public static Generator<BigFish> generator() {
        return new Generator<BigFish>() {

            @Override
            public BigFish next() {
                return new BigFish();
            }
        };
    }
}

public class Ocean {

    public static void serve(BigFish bf, LittleFish lf) {
        System.out.println(bf + " eats " + lf);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<LittleFish> line = new LinkedList<LittleFish>();
        Generators.fill(line, LittleFish.generator(), 15);

        List<BigFish> bigFishes = new ArrayList<BigFish>();
        Generators.fill(bigFishes, BigFish.generator(), 4);

        for (LittleFish c : line)
            serve(bigFishes.get(rand.nextInt(bigFishes.size())), c);

    }
}
