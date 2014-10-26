package generics;

import java.util.Arrays;
import java.util.List;

public class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Number> flist = Arrays.asList(new Integer(5));
        Integer a = (Integer) flist.get(0); // No warning
        System.out.println(flist.contains(new Integer(5))); // Argument is ‘Object’
        System.out.println(flist.indexOf(new Integer(5))); // Argument is ‘Object’
    }
}
