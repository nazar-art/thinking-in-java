package net.lelyak.operators;

import static net.lelyak.mindview.util.Print.print;

public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        print("big = " + big);
        int bigger = big * 4;
        print("bigger = " + bigger);
    }
}
