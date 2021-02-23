package net.lelyak.io;

import java.nio.*;
import java.nio.channels.*;
import java.io.*;

// { Args: src/main/java/net.lelyak.io/ChannelCopy.java src/main/java/net.lelyak.io/test.txt }
public class ChannelCopy {

    private static final int BSIZE = 1024;

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {

        if (args.length != 2) {
            System.err.println("arguments: sourcefile destfile");
            System.exit(1);
        }

        FileChannel in = new FileInputStream(args[0]).getChannel(),
                out = new FileOutputStream(args[1]).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);

        while (in.read(buffer) != -1) {
            buffer.flip(); // Prepare for writing
            out.write(buffer);
            buffer.clear(); // Prepare for reading
        }
    }
} // /:~
