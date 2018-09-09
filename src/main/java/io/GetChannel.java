package io;

import java.nio.*;
import java.nio.channels.*;
import java.io.*;

public class GetChannel {

    private static final int BSIZE = 1024;
    public static final String FILE_LOCATION = "src/main/java/io/data.txt";

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {

        // Write a file:
        FileChannel fc = new FileOutputStream(FILE_LOCATION).getChannel();
        fc.write(ByteBuffer.wrap("Some text ".getBytes()));
        fc.close();

        // Add to the end of the file:
        fc = new RandomAccessFile(FILE_LOCATION, "rw").getChannel();
        fc.position(fc.size()); // Move to the end
        fc.write(ByteBuffer.wrap("Some more".getBytes()));
        fc.close();

        // Read the file:
        fc = new FileInputStream(FILE_LOCATION).getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();

        while (buff.hasRemaining())
            System.out.print((char) buff.get());
    }
}
