package net.lelyak.courses.procedural.loops;

public class BackwardFor {
    public static void main(String[] args) {
        for (int k = 0; k < 10; k++) {
            System.out.print(k + " ");
            k-=2;
        }
    }
}
