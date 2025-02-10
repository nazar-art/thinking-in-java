package net.lelyak.enumerated;

//: net.lelyak.enumerated/cartoons/EnumImplementation.java
//An enum can implement an interface

import java.util.Random;

/* Exercise 2: (2) Instead of implementing an interface, make next( ) a static method.
 *  What are the benefits and drawbacks of this approach?
*/

enum CartoonCharacter {

    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;

    private static Random rand = new Random(47);

    public static CartoonCharacter next() {
        return values()[rand.nextInt(values().length)];
    }
}

public class EnumImplementation {

    public static <T> void printNext() {
        System.out.print(CartoonCharacter.next() + ", ");
    }

    public static void main(String[] args) {

        // Choose any instance:
        // CartoonCharacter cc = CartoonCharacter.BOB;
        for (int i = 0; i < 10; i++)
            printNext();
    }
} 

