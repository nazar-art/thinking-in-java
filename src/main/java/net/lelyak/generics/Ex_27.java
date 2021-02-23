package net.lelyak.generics;

import java.util.ArrayList;
import java.util.List;

/*
 * Exercise 27: (2) Show that covariance doesn’t work with Lists, using Numbers and
 *	Integers, then introduce wildcards.
 */

public class Ex_27 {

    public static void main(String[] args) {
        List<? extends Number> nlist = new ArrayList<Integer>();
        //nlist.add(new Integer(5));
        nlist.add(null);
        System.out.println(nlist);
    }
}
