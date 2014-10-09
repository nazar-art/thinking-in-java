package generics;

/*
 * Exercise 26: (2) Demonstrate array covariance using Numbers and Integers
 */

public class Ex_26 {
	
	public static void main(String[] args) {
		Number[] array = new Integer[6];
		array[0] = Integer.valueOf(5);
		array[1] = new Integer(8);
		try {
			array[2] = Double.valueOf(5.0);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			array[3] = Byte.valueOf((byte) 1);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
