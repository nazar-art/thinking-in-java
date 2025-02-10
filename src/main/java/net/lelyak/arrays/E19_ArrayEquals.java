package net.lelyak.arrays;

import java.util.Arrays;

/*
 * Exercise 19: (2) Create a class with an int field that’s initialized from a constructor
 *	argument. Create two net.lelyak.arrays of these objects, using identical initialization values for each
 *	array, and show that Arrays.equals( ) says that they are unequal. Add an equals( )
 *	method to your class to fix the problem.
 */

public class E19_ArrayEquals {
    private int value;

    public E19_ArrayEquals(int arg) {
        value = arg;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + value;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        E19_ArrayEquals other = (E19_ArrayEquals) obj;
        if (value != other.value)
            return false;
        return true;
    }

    public static void main(String[] args) {
        E19_ArrayEquals[] array1 = {
                new E19_ArrayEquals(1), new E19_ArrayEquals(2), new E19_ArrayEquals(3)
        };

        E19_ArrayEquals[] array2 = {
                new E19_ArrayEquals(1), new E19_ArrayEquals(2), new E19_ArrayEquals(3)
        };

        System.out.println(Arrays.equals(array1, array2));
    }

}
