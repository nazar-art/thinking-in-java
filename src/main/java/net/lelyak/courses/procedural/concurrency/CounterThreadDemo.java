package net.lelyak.courses.procedural.concurrency;

class Counter {
    private long counter;

    public synchronized void add(long value) {
        this.counter += value;
    }

    public long getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return String.valueOf(counter);
    }
}

class CounterThread extends Thread {
    protected Counter counter;

    public CounterThread(String name, Counter counter) {
        super(name);
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.add(i);
            System.out.printf("%s: %d\n", Thread.currentThread().getName(), counter.getCounter());
        }
    }
}

public class CounterThreadDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterThread thread1 = new CounterThread("Thread1", counter);
        CounterThread thread2 = new CounterThread("Thread2", counter);

        thread1.start();
        thread2.start();
    }
}
