package arrays;

import java.util.Arrays;

/*
 * Exercise 22: (2) Show that the results of performing a binarySearch( ) on an unsorted
 *	array are unpredictable.
 */

public class E22_BinarySearch {

	public static void main(String[] args) {
		int[] array = {
				23, 43, 56, 64, 97, 12, 64, 83, 17, 3, 85
		};
		
		System.out.println(Arrays.binarySearch(array, 23));
	}

}
