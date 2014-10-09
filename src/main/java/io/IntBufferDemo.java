package io;

import java.nio.*;

public class IntBufferDemo {
	
	private static final int BSIZE = 1024;

	public static void main(String[] args) {
		
		ByteBuffer bb = ByteBuffer.allocate(BSIZE);
		DoubleBuffer ib = bb.asDoubleBuffer();
		
		// Store an array of int:
		ib.put(new double[] { 11.1, 42.2, 47.7, 99.9, 143.3, 811.8, 1016.6 });
		
		// Absolute location read and write:
		System.out.println("third element: " + ib.get(3));
		ib.put(3, 1811d);
		
		// Setting a new limit before rewinding the buffer.
		ib.flip();
		while (ib.hasRemaining()) {
			double i = ib.get();
			System.out.println(i);
		}
	}
}
