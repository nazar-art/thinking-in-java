package net.lelyak.concurrency;

//: net.lelyak.concurrency/CloseResource.java
// Interrupting a blocked task by
// closing the underlying resource.
// {RunByHand}

import java.net.*;
import java.util.concurrent.*;
import java.io.*;

import static net.lelyak.mindview.util.Print.*;

public class CloseResource {

    public static void main(String[] args) throws Exception {

        ExecutorService exec = Executors.newCachedThreadPool();

        @SuppressWarnings({"unused", "resource"})
        ServerSocket server = new ServerSocket(8080);
        @SuppressWarnings("resource")
        InputStream socketInput = new Socket("localhost", 8080).getInputStream();

        exec.execute(new IOBlocked(socketInput));
        exec.execute(new IOBlocked(System.in));

        TimeUnit.MILLISECONDS.sleep(100);

        print("Shutting down all threads");
        exec.shutdownNow();

        TimeUnit.SECONDS.sleep(1);

        print("Closing " + socketInput.getClass().getName());
        socketInput.close(); // Releases blocked thread

        TimeUnit.SECONDS.sleep(1);

        print("Closing " + System.in.getClass().getName());
        System.in.close(); // Releases blocked thread
    }
}