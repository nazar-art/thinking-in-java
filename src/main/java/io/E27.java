package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Exercise 27: (1) Create a Serializable class containing a reference to an object of a
 *	second Serializable class. Create an instance of your class, serialize it to disk, then restore it
 *	and verify that the process worked correctly.
 */

@SuppressWarnings("serial")
class One implements Serializable {
	String name;

	public One(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

@SuppressWarnings("serial")
class Second implements Serializable {
	One one;

	public Second(One one) {
		this.one = one;
	}

	@Override
	public String toString() {
		return one.toString();
	}
}

public class E27 {

	public static void main(String[] args) {
		Second second = new Second(new One("this is one instance ;-) ..."));
		Second instance = new Second(new One("this is another instance ;-)) ..."));

		try (ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream(Location.LOC + "E27.data"));) {
			out.writeObject(second);
			out.writeObject(instance);
			System.out.println("Write");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(Location.LOC + "E27.data"));) {
			System.out.println("Recovering:");
			System.out.println((Second) in.readObject());
			System.out.println((Second) in.readObject());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
