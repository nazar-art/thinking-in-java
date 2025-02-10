package net.lelyak.courses.procedural.recursion;

public class ReverseFibonacciQuizWithRotation {
    public static void main(String[] args) {
        f(5);
    }
    public static int f(int x) {
        int result;
        if (x == 0) {
            result = 0;
        } else if (x == 1) {
            result = 1;
        } else if (x % 2 == 0) {
            result = f(x - 2) + f(x - 1);
        } else {
            result = f(x - 1) + f(x - 2);
        }
        System.out.print(" " + x);
        return result;
    }
}
