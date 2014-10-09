package containers;

import java.util.*;

/*
 * Exercise 6: (2) 
 * Note that List has additional "optional" operations that are not included
 *	in Collection. Write a version of Unsupported.java that tests these additional optional
 *	operations.
 */

public class E06_UnsupportedList {

	static void test(String msg, List<String> l) {
		System.out.println("--- " + msg + " ---");
		// Collection<String> c = list;
		Collection<String> subList = l.subList(1, 8);

		try {
			l.add(0, "test");
		} catch (Exception e) {
			System.out.println("add(index, element): " + e);
		}
		try {
			l.addAll(0, subList);
		} catch (Exception e) {
			System.out.println("addAll(index, element): " + e);
		}
		try {
			l.remove(0);
		} catch (Exception e) {
			System.out.println("remove(index): " + e);
		}
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
		test("Modifiable Copy", new ArrayList<String>(list));
		test("Arrays.asList()", list);
		test("unmodifiableList()",
				Collections.unmodifiableList(new ArrayList<String>(list)));

	}
}
