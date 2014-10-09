package exceptions;

/*
 * Exercise 14: (2) Show that OnOffSwitch.java can fail by throwing a
 RuntimeException inside the try block.
 */

class Switch {
	private boolean state = false;

	public boolean read() {
		return state;
	}

	public void on() {
		state = true;
		System.out.println(this);
	}

	public void off() {
		state = false;
		System.out.println(this);
	}

	public String toString() {
		return state ? "on" : "off";
	}
}

public class Ex_13_OnOffSwitch {
	private static Switch sw = new Switch();

	public static void f() throws OnOffException1, OnOffException2 {
		throw new RuntimeException("Inside try");
	}

	public static void main(String[] args) {
		try {
			try {
				sw.on();
				// Code that can throw exceptions...
				f();
				sw.off();
			} catch (OnOffException1 e) {
				System.out.println("OnOffException1");
				sw.off();
			} catch (OnOffException2 e) {
				System.out.println("OnOffException2");
				sw.off();
			}
		} catch (RuntimeException e) {
			System.out.println(sw);
			System.out.println("Oops! the exception '" + e
					+ "' slipped through without " + "turning the switch off!");

		}
	}
}
