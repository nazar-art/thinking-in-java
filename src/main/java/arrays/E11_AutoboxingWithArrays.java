package arrays;

/**
 * *************** Exercise 11 *****************
 * Show that autoboxing doesn’t work with arrays.
 * **********************************************
 */

public class E11_AutoboxingWithArrays {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int[] pa = {1, 2, 3, 4, 5};
        //Integer[] wa = pa;
        Integer[] wb = {1, 2, 3, 4, 5};
        /*int[] pb = wb;*/
    }
}
