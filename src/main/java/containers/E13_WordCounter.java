package containers;

import java.util.List;

import strings.TextFile;

public class E13_WordCounter {
	public static void main(String[] args) {
		
		List<String> words = new TextFile("src/containers/E12.java", "\\W+");
		AssociativeArray<String, Integer> map = new AssociativeArray<String, Integer>(
				words.size());
		for (String word : words) {
			Integer freq = map.get(word);
			map.put(word, freq == null ? 1 : freq + 1);
		}
		System.out.println(map);
	}

}
