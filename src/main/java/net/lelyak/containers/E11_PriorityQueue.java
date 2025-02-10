package net.lelyak.containers;

import java.util.PriorityQueue;
import java.util.Random;

/*
 * Exercise 11: (2) Create a class that contains an Integer that is initialized to a value
 *	between o and 100 using java.util.Random. Implement Comparable using this Integer
 *	field. Fill a PriorityQueue with objects of your class, and extract the values using poll( ) to
 *	show that it produces the expected order.
 */

class Item implements Comparable<Item> {

    private static final Random RANDOM = new Random();
    private Integer priority = RANDOM.nextInt(101);

    @Override
    public int compareTo(Item arg) {
        return priority < arg.priority ? -1 :
                priority == arg.priority ? 0 : 1;
    }

    @Override
    public String toString() {
        return Integer.toString(priority);
    }

}

public class E11_PriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Item> queue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.add(new Item());
        }
        System.out.println(queue.toString());
        Item item;
        while ((item = queue.poll()) != null) {
            System.out.println(item);
        }
    }

}
