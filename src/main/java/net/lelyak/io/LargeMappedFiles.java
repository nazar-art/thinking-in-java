package net.lelyak.io;

import java.nio.*;
import java.nio.channels.*;
import java.io.*;

import static net.lelyak.mindview.util.Print.*;

public class LargeMappedFiles {

    static int length = 0x8FFFFFF; // 128 MB

    public static void main(String[] args) throws Exception {

        @SuppressWarnings("resource")
        MappedByteBuffer out = new RandomAccessFile("./src/net.lelyak.io/test.dat", "rw")
                .getChannel().map(FileChannel.MapMode.READ_WRITE, 0, length);
        for (int i = 0; i < length; i++)
            out.put((byte) 'x');
        print("Finished writing");

        for (int i = length / 2; i < length / 2 + 6; i++)
            printnb((char) out.get(i));
    }
}
