package concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Exercise 1: (2) Implement a Runnable. Inside run( ), print a message, and then call
 *  yield( ). Repeat this three times, and then return from run( ). Put a startup message in the
 *  constructor and a shutdown message when the task terminates. Create a number of these
 *  tasks and drive them using threads.
 *  
 * Exercise 3: (1) Repeat Exercise 1 using the different types of executors shown in this
 *	section.
 */

class Run implements Runnable {

    private static int taskCount = 0;

    private final int id = taskCount++;

    public Run() {
        System.out.println("run instance are created! " + id);
    }

    @Override
    public void run() {
        System.out.println("Stage 1..., ID = " + id);
        Thread.yield();
        System.out.println("Stage 2..., ID = " + id);
        Thread.yield();
        System.out.println("Stage 3..., ID = " + id);
        Thread.yield();
        System.out.println("Printer ended, ID = " + id);
    }

}

public class E01 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service = Executors.newFixedThreadPool(5);
        service = Executors.newSingleThreadExecutor();

        for (int i = 0; i <= 5; i++) {
//			new Thread(new Run()).start();
            service.execute(new Run());
        }

    }
}
