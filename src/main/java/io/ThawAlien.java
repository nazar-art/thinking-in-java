package io;

import java.io.*;

public class ThawAlien {

    public static void main(String[] args) throws Exception {

        @SuppressWarnings("resource")
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File(Location.LOC + "X.file")));
        Object mystery = in.readObject();
        System.out.println(mystery.getClass());
    }
}
