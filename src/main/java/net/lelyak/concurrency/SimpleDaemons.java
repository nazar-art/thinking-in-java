package net.lelyak.concurrency;

// Daemon threads don't prevent the program from ending.

import java.util.concurrent.*;

import static net.lelyak.mindview.util.Print.*;

public class SimpleDaemons implements Runnable {

    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(70);
                print(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            print("sleep() interrupted");
        }
    }

    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true); // Must call before start()
            daemon.start();
        }

        print("All daemons started");
        TimeUnit.MILLISECONDS.sleep(200);
    }
}
