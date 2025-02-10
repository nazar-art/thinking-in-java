package net.lelyak.courses.procedural.concurrency;

public class ConcurrentCounter {
    public static final int N = 1000_000_000;
    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t0 = new Thread(new Runnable() {
            public void run() {
                for (int k = 0; k < N; k++) counter++;
            }
        });
        t0.start();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int k = 0; k < N; k++) counter++;
            }
        });
        t1.start();

        t0.join();
        t1.join();

        System.out.println(counter);
    }
}
