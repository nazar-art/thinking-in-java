package io;

// Using transferTo() between channels
// {Args: ./src/io/TransferTo.java ./src/io/TransferTo.txt}

import java.nio.channels.*;
import java.io.*;

public class TransferTo {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {

        if (args.length != 2) {
            System.out.println("arguments: sourcefile destfile");
            System.exit(1);
        }

        FileChannel in = new FileInputStream(args[0]).getChannel(), out = new FileOutputStream(
                args[1]).getChannel();
        in.transferTo(0, in.size(), out);
        // Or:
        // out.transferFrom(in, 0, in.size());
    }
}
