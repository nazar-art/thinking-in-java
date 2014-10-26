package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 * Exercise 7: (2) 
 * Open a text file so that you can read the file one line at a time. Read each
 *	line as a String and place that String object into a LinkedList. Print all of the lines in the
 *	LinkedList in reverse order.
 */

class Reader {

    public static List<String> read(String filename) throws IOException {
        List<String> ll = new LinkedList<>();
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s = null;
        int count = 0;

        while ((s = in.readLine()) != null && count < 350) {
            ll.add(s);
            count++;
        }

        in.close();
        return ll;
    }
}

public class E07_FileIntoList {

    public static void main(String[] args) throws IOException {

        List<String> list = Reader.read("gutenberg/cristo.txt");

        for (ListIterator<String> it = list.listIterator(list.size()); it.hasPrevious(); )
            System.out.println(it.previous());
    }

}
