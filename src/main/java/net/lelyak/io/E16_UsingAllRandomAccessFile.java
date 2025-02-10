package net.lelyak.io;

import java.io.*;

import static net.lelyak.mindview.util.Print.*;

public class E16_UsingAllRandomAccessFile {
    static String file = "rtest.dat";

    static void display() throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "r");
        print(rf.readBoolean());
        print(rf.readByte());
        print(rf.readUnsignedByte());
        print(rf.readChar());
        print(rf.readFloat());
        print(rf.readLong());
        print(rf.readInt());
        print(rf.readShort());
        print(rf.readUnsignedShort());
        print(rf.readDouble());
        print(rf.readUTF());
        rf.close();
    }

    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "rw");
        rf.writeBoolean(true);
        rf.writeByte(100);
        rf.writeByte(255);
        rf.writeChar('A');
        rf.writeFloat(1.41413f);
        rf.writeLong(1000000000L);
        rf.writeInt(100000);
        rf.writeShort(30000);
        rf.writeShort(65535);
        rf.writeDouble(3.14159);
        rf.writeUTF("The end of the file");
        rf.close();
        display();

        System.out.println();
        rf = new RandomAccessFile(file, "rw");
        rf.seek(3); // 1 boolean + 2 bytes
        rf.writeChar('B');
        rf.close();
        display();
    }
}
