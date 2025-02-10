//: net.lelyak.concurrency/E17_RadiationCounter.java
/****************** Exercise 17 ************************
 * Create a radiation counter that can have any number of
 * remote sensors.
 ******************************************************/
package net.lelyak.concurrency;

import java.util.concurrent.*;
import java.util.*;

import static net.lelyak.mindview.util.Print.*;

class Sensor implements Runnable {

    private static Random rand = new Random(47);
    private static Count count = new Count();
    private static List<Sensor> sensors = new ArrayList<Sensor>();
    private int number;
    private final int id;
    private static volatile boolean canceled = false;

    public static void cancel() {
        canceled = true;
    }

    public Sensor(int id) {
        this.id = id;
        sensors.add(this);
    }

    public void run() {
        while (!canceled) {
            // Simulate a random occurrence of an ionizing event
            if (rand.nextInt(5) == 0) {
                synchronized (this) {
                    ++number;
                }
                count.increment();
            }
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                print("sleep interrupted");
            }
        }
    }

    public synchronized int getValue() {
        return number;
    }

    public String toString() {
        return "Sensor " + id + ": " + getValue();
    }

    public static int getTotalCount() {
        return count.value();
    }

    public static int sumSensors() {
        int sum = 0;
        for (Sensor sensor : sensors)
            sum += sensor.getValue();
        return sum;
    }
}

public class E17_RadiationCounter {
    public static void main(String[] args) throws Exception {

        ExecutorService exec = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++)
            exec.execute(new Sensor(i));
        TimeUnit.SECONDS.sleep(3);
        Sensor.cancel();

        exec.shutdown();

        if (!exec.awaitTermination(250, TimeUnit.MILLISECONDS))
            print("Some tasks were not terminated!");
        print("Total: " + Sensor.getTotalCount());
        print("Sum of Sensors: " + Sensor.sumSensors());
    }
}
