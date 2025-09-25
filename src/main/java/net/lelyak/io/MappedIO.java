package net.lelyak.io;

import java.nio.*;
import java.nio.channels.*;
import java.io.*;

public class MappedIO {
    private static final int numOfInts = 4000000;
    private static final int numOfUbuffInts = 200000;

    private abstract static class Tester {
        private final String name;

        public Tester(String name) {
            this.name = name;
        }

        public void runTest() {
            System.out.print(name + ": ");
            try {
                long start = System.nanoTime();
                test();
                double duration = System.nanoTime() - start;
                System.out.format("%.2f\n", duration / 1.0e9);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public abstract void test() throws IOException;
    }

    private static final String FILE_PATH = "./src/main/java/net/lelyak/io/temp.tmp";

    private static final Tester[] tests = {new Tester("Stream Write") {

        public void test() throws IOException {
            DataOutputStream dos = new DataOutputStream(
                    new BufferedOutputStream(new FileOutputStream(new File(FILE_PATH))));
            for (int i = 0; i < numOfInts; i++)
                dos.writeInt(i);
            dos.close();
        }
    }, new Tester("Mapped Write") {
        public void test() throws IOException {
            @SuppressWarnings("resource")
            FileChannel fc = new RandomAccessFile(FILE_PATH, "rw").getChannel();
            IntBuffer ib = fc.map(FileChannel.MapMode.READ_WRITE, 0, fc.size()).asIntBuffer();
            for (int i = 0; i < numOfInts; i++)
                ib.put(i);
            fc.close();
        }
    }, new Tester("Stream Read") {
        public void test() throws IOException {
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(FILE_PATH)));
            for (int i = 0; i < numOfInts; i++)
                dis.readInt();
            dis.close();
        }
    }, new Tester("Mapped Read") {
        public void test() throws IOException {
            @SuppressWarnings("resource")
            FileChannel fc = new FileInputStream(new File(FILE_PATH)).getChannel();
            IntBuffer ib = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size()).asIntBuffer();
            while (ib.hasRemaining())
                ib.get();
            fc.close();
        }
    }, new Tester("Stream Read/Write") {
        public void test() throws IOException {
            RandomAccessFile raf = new RandomAccessFile(new File(FILE_PATH), "rw");
            raf.writeInt(1);
            for (int i = 0; i < numOfUbuffInts; i++) {
                raf.seek(raf.length() - 4);
                raf.writeInt(raf.readInt());
            }
            raf.close();
        }
    }, new Tester("Mapped Read/Write") {
        public void test() throws IOException {
            @SuppressWarnings("resource")
            FileChannel fc = new RandomAccessFile(new File(FILE_PATH), "rw")
                    .getChannel();
            IntBuffer ib = fc.map(FileChannel.MapMode.READ_WRITE, 0, fc.size())
                    .asIntBuffer();
            ib.put(0);
            for (int i = 1; i < numOfUbuffInts; i++)
                ib.put(ib.get(i - 1));
            fc.close();
        }
    }};

    public static void main(String[] args) {
        for (Tester test : tests)
            test.runTest();
    }
}
