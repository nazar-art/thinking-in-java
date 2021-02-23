package net.lelyak.io;

//: net.lelyak.io/TestEOF.java
// Testing for end of file while reading a byte at a time.

import java.io.*;

public class TestEOF {

    public static void main(String[] args) throws IOException {
        int i = 0;
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(new FileInputStream("gutenberg/cristo.txt")));

        while (in.available() != 0 && i < 500) {
            System.out.print((char) in.readByte());
            i++;
        }
    }
} 
