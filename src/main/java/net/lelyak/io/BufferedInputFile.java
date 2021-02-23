package net.lelyak.io;

import java.io.*;

public class BufferedInputFile {

    // Throw net.lelyak.exceptions to console:
    public static String read(String filename) throws IOException {

        // Reading input by lines:
        BufferedReader in = new BufferedReader(new FileReader(filename));
        StringBuilder sb = new StringBuilder();
        String s;
        int i = 0;

        while ((s = in.readLine()) != null
                && (i < 500)
                ) {
            sb.append(s + "\n");
            i++;
        }

        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.print(read("gutenberg/cristo.txt"));
    }
}
