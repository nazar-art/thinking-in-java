package concurrency;

import static net.mindview.util.Print.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class WaitPerson3 implements Runnable {
    Restaurant3 restaurant;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public WaitPerson3(Restaurant3 restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                lock.lock();
                try {
                    while (restaurant.meal == null) {
                        condition.await();
                    }
                } finally {
                    lock.unlock();
                }
                print("Waitperson got " + restaurant.meal);
                restaurant.chef.lock.lock();

                try {
                    restaurant.meal = null;
                    restaurant.chef.condition.signalAll();
                } finally {
                    restaurant.chef.lock.unlock();
                }
            }
        } catch (InterruptedException e) {
            print("WaitPerson interrupted");
        }
    }

}

class Chef3 implements Runnable {
    Restaurant3 restaurant;
    int count = 0;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public Chef3(Restaurant3 restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                lock.lock();
                try {
                    while (restaurant.meal != null) {
                        condition.await();
                    }
                } finally {
                    lock.unlock();
                }
                if (++count == 10) {
                    print("Out of food, closing");
                    restaurant.exec.shutdownNow();
                }
                printnb("Order up! ");
                restaurant.waitPerson.lock.lock();

                try {
                    restaurant.meal = new Meal(count);
                    restaurant.waitPerson.condition.signalAll();
                } finally {
                    restaurant.waitPerson.lock.unlock();
                }
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            print("Chef interrupted");
        }
    }
}

class Restaurant3 {
    Meal meal;
    ExecutorService exec = Executors.newCachedThreadPool();
    WaitPerson3 waitPerson = new WaitPerson3(this);
    Chef3 chef = new Chef3(this);

    public Restaurant3() {
        exec.execute(chef);
        exec.execute(waitPerson);
    }
}

public class E27_Restaurant3 {
    public static void main(String[] args) {
        new Restaurant3();
    }
}
