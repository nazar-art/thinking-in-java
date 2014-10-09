package containers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Exercise 12: (1) Substitute a HashMap, a TreeMap and a LinkedHashMap in
 *	AssociativeArray .Java’s main( ).
 */

public class E12 {
	
	public static void main(String[] args) {
		test(new HashMap<String, String>());
		test(new TreeMap<String, String>());
		test(new LinkedHashMap<String, String>());
	}

	private static void test(Map<String, String> map) {
		map.put("sky", "blue");
		map.put("grass", "green");
		map.put("ocean", "dancing");
		map.put("tree", "tall");
		map.put("earth", "brown");
		map.put("sun", "warm");
		try {
			map.put("extra", "object"); // Past the end
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Too many objects!");
		}
		System.out.println(map);
		System.out.println(map.get("ocean"));
	}
}
