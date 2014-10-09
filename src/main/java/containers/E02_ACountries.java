package containers;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * Exercise 2: (2) Produce a Map and a Set containing all the countries that begin with ‘A’.
 */

public class E02_ACountries {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>(Countries.capitals());
		TreeSet<String> set = new TreeSet<>(Countries.names());
		String b = null;
		
		for (String s : map.keySet()) {
			if (s.startsWith("B")) { 
				b = s;
				break;
			}
		}
		
		Map<String, String> aMap = map.headMap(b);
		Set<String> aSet = set.headSet(b);
		System.out.println("aMap " + aMap);
		System.out.println("aSet " + aSet);
	}
}
