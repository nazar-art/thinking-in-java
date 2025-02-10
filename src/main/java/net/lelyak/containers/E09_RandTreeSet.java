package net.lelyak.containers;

import java.util.TreeSet;

/*
 * Exercise 9: (2) 
 * Use RandomGenerator.String to fill a TreeSet, but use alphabetic
 *	ordering. Print the TreeSet to verify the sort order.
 */
public class E09_RandTreeSet {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        ts.addAll(CollectionData.list(new RandomGenerator.String(), 10));
        System.out.println("ts = " + ts);
    }

}
