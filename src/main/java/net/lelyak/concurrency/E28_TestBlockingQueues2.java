package net.lelyak.concurrency;

import static net.lelyak.mindview.util.Print.print;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

class LiftOffProducer implements Runnable {
    private LiftOffRunner runner;

    public LiftOffProducer(LiftOffRunner runner) {
        this.runner = runner;
    }

    public void run() {
        for (int i = 0; i < 5; i++)
            runner.add(new LiftOff(5));
        print("Exiting LiftOffProducer");
    }
}

public class E28_TestBlockingQueues2 {
    private static void getkey() {
        try {
            new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void getkey(String message) {
        print(message);
        getkey();
    }

    private static void test(String msg, BlockingQueue<LiftOff> queue) {
        ExecutorService exec = Executors.newFixedThreadPool(2);
        print(msg);
        LiftOffRunner runner = new LiftOffRunner(queue);
        LiftOffProducer producer = new LiftOffProducer(runner);
        exec.execute(runner);
        exec.execute(producer);
        getkey("Press 'ENTER' (" + msg + ")");
        exec.shutdownNow();
        print("Finished " + msg + " test");
    }

    public static void main(String[] args) {
        test("LinkedBlockingQueue", // Unlimited size
                new LinkedBlockingQueue<LiftOff>());
        test("ArrayBlockingQueue", // Fixed size
                new ArrayBlockingQueue<LiftOff>(3));
        test("SynchronousQueue",
                // Size of 1
                new SynchronousQueue<LiftOff>());
    }
}