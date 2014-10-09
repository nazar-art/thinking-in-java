//: concurrency/waxomatic/WaxOMatic.java
// Basic task cooperation.
package concurrency.waxomatic;

import static net.mindview.util.Print.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Car {
	private boolean waxOn = false;

	public synchronized void waxed() {
		waxOn = true; // Ready to buff
		notifyAll();
	}

	public synchronized void buffed() {
		waxOn = false; // Ready for another coat of wax
		notifyAll();
	}

	public synchronized void waitForWaxing() throws InterruptedException {
		while (waxOn == false)
			wait();
		System.out.println("Wait For Waxing Finnished:WAXON iS NOW TRUE");
	}

	public synchronized void waitForBuffing() throws InterruptedException {
		while (waxOn == true)
			wait();
		System.out.println("Wait For Buffing Finnished:WAXON iS NOW FALSE");
	}
}

class WaxOn implements Runnable {
	private Car car;

	public WaxOn(Car c) {
		car = c;
	}

	public void run() {
		try {
			while (!Thread.interrupted()) {
				printnb("Wax On! ");
				TimeUnit.MILLISECONDS.sleep(200);
				car.waxed();// waxOn = true; // Ready to buff notifyAll();
				car.waitForBuffing();// while(waxOn == true) wait();
			}
		} catch (InterruptedException e) {
			print("Exiting via interrupt");
		}
		print("Ending Wax On task");
	}
}

class WaxOff implements Runnable {
	private Car car;

	public WaxOff(Car c) {
		car = c;
	}

	public void run() {
		try {
			while (!Thread.interrupted()) {
				car.waitForWaxing();// while(waxOn == false) wait();
				printnb("Wax Off! ");
				TimeUnit.MILLISECONDS.sleep(200);
				car.buffed(); // waxOn = false; // Ready for another coat of wax
								// notifyAll();
			}
		} catch (InterruptedException e) {
			print("Exiting via interrupt");
		}
		print("Ending Wax Off task");
	}
}

public class WaxOMatic {
	public static void main(String[] args) throws Exception {
		Car car = new Car();
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new WaxOff(car));
		exec.execute(new WaxOn(car));
		TimeUnit.SECONDS.sleep(5); // Run for a while...
		exec.shutdownNow(); // Interrupt all tasks
	}
} 
