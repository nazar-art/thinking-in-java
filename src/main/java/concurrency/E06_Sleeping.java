package concurrency;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*Exercise 6: (2) Create a task that sleeps for a random amount of time between 1 and 10
 *  seconds, then displays its sleep time and exits. Create and run a quantity (given on the
 *  command line) of these tasks.
 */

class SleepingTask2 implements Runnable {

    private static Random random = new Random();

    @Override
    public void run() {
        int duration = random.nextInt(10) + 1;
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("sleeping time was %d sec%n", duration);
    }

}

public class E06_Sleeping {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newCachedThreadPool();

        if (args.length != 1) {
            System.err.println("Provide the quantity of tasks to run");
            return;
        }

        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            executor.execute(new SleepingTask2());
        }

        Thread.yield();
        executor.shutdown();
    }
}
