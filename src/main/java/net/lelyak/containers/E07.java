package net.lelyak.containers;

import java.util.*;

/*
 * Exercise 7: (4) 
 * Create both an ArrayList and a LinkedList, and fill each using the
 *	Countries.names( ) generator. Print each list using an ordinary Iterator, then insert one
 *	list into the other by using a Listlterator, inserting at every other location. Now perform the
 *	insertion starting at the end of the first list and moving backward.
 */

public class E07 {

    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        List al = new ArrayList<>(Countries.names(10));
        @SuppressWarnings("rawtypes")
        List ll = new LinkedList<>(Countries.names(10));
        StringBuilder builder = new StringBuilder(1024);

        @SuppressWarnings("unchecked")
        Iterator<String> iter1 = al.iterator();
        while (iter1.hasNext()) {
            builder.append(iter1.next() + " ");
        }
        System.out.println("ArrayList: \t" + builder);
        builder.setLength(0);

        @SuppressWarnings("unchecked")
        Iterator<String> iterator = ll.iterator();
        while (iterator.hasNext()) {
            builder.append(iterator.next() + " ");
        }
        System.out.println("LinkedList: \t" + builder);
    }
}
