package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

enum State {
    TICK, TOCK
}

class TickTack {
    State state;

    synchronized void tick(boolean running) {
        if (!running) {
            state = State.TICK;
            notify();
            return;
        }

        state = State.TICK;
        System.out.print("Tick ");
        notify();
        sleep();

        try {
            while (state != State.TOCK) {
                wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    synchronized void tock(boolean running) {
        if (!running) {
            state = State.TOCK;
            notify();
            return;
        }

        state = State.TOCK;
        System.out.println("Tock");
        notify();
        sleep();

        try {
            while (state != State.TICK) {
                wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    void sleep() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("sleep interrupted");
        }
    }
}

class TickTackTask implements Runnable {
    Thread thread;
    TickTack tickTack;
    int numberLimit;

    public TickTackTask(String name, TickTack tickTack, int numberLimit) {
        thread = new Thread(this, name);
        this.tickTack = tickTack;
        this.numberLimit = numberLimit;
//        thread.start();
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equalsIgnoreCase("tick")) {
            for (int i = 0; i <= numberLimit; i++) {
                tickTack.tick(true);
            }
            tickTack.tick(false);
        } else {
            for (int i = 0; i <= numberLimit; i++) {
                tickTack.tock(true);
            }
            tickTack.tock(false);
        }
    }
}

public class TickTackDemo {
    public static void main(String[] args) {

        TickTack tt = new TickTack();
        /*TickTackTask first = new TickTackTask("tick", tt, 10);
        TickTackTask second = new TickTackTask("tock", tt, 10);
        first.thread.start();
        second.thread.start();
        try {
            first.thread.join();
            second.thread.join();
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }*/

        int numberLimit = 10;

        Runnable task = () -> {
            for (int i = 0; i <= numberLimit; i++) {
                tt.tick(true);
            }
            tt.tick(false);
        };
        Runnable task2 = () -> {
            for (int i = 0; i <= numberLimit; i++) {
                tt.tock(true);
            }
            tt.tock(false);
        };
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(task);
        executor.execute(task2);

        executor.shutdown();
    }
}
