package net.lelyak.courses.selenium;

import java.util.*;

public class Test {
    private static HashMap<String, Set<String>> map = new HashMap<>();

    public static void addValue(String key, Set<String> value) {
        Set<String> stringSet = map.get(key);
        if (stringSet != null) {
            updateSet(key, value, stringSet);
            return;
        }
        map.put(key, value);
        System.out.println(map.get(key));
    }

    private static void updateSet(String key, Set<String> value, Set<String> stringSet) {
        stringSet.addAll(value);
        map.put(key, stringSet);
        System.out.println(stringSet);
    }

    public static void main(String[] args) {
        addValue("hello", new HashSet<>(Arrays.asList("world", "duck", "dog")));
        addValue("hello", new HashSet<>(Arrays.asList("flip")));
        addValue("hello", new HashSet<>(Arrays.asList("flop")));
        System.out.println(map);
    }
}
