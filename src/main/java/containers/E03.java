package containers;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Exercise 3: (1) Using Countries, fill a Set multiple times with the same data and verify
 *	that the Set ends up with only one of each instance. Try this with HashSet,
 *	LinkedHashSet, and TreeSet.
 */

public class E03 {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        for (int i = 0; i < 5; i++)
            set.addAll(Countries.names(10));
        System.out.println("LinkedHashSet: \t" + set);

        set = new HashSet<>();
        for (int i = 0; i < 5; i++)
            set.addAll(Countries.names(10));
        System.out.println("HashSet \t" + set);

        set = new TreeSet<>();
        for (int i = 0; i < 5; i++)
            set.addAll(Countries.names(10));
        System.out.println("TreeSet \t" + set);
    }
}
