package io;

import java.io.*;

public class FormattedMemoryInput {

    static String file = "gutenberg/cristo.txt";

    public static void main(String[] args) throws IOException {
        boolean done = false;

        try (DataInputStream in = new DataInputStream(new ByteArrayInputStream(
                BufferedInputFile.read(file).getBytes()));) {

            while (!done) {
                System.out.print((char) in.readByte());
                System.out.flush();
            }
        } catch (EOFException e) {
            System.err.println("End of stream");
        } finally {
            System.out.println("\nthe file size: " + new File(file).length());
        }
    }
}
