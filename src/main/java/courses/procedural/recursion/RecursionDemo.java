package courses.procedural.recursion;

class RecursionPrintInOutExplanation {
    private static int depth = 0;

    public static void f(int x) {
        in(x);
        if (check(x)) {
            f(2 * x);
        }
        out(x);
    }
    public static boolean check(int x) {
        spaces();
        System.out.println("(x < 7): " + (x < 7));
        return x < 15;
    }

    public static void in(int x) {
        spaces();
        System.out.println("(" + x + ")->");
        depth++;
    }
    public static void out(int x) {
        depth--;
        spaces();
        System.out.println("<-(" + x + ")");
    }
    private static void spaces() {
        for (int k = 0; k < depth; k++) {
            System.out.print("   ");
        }
    }
}

public class RecursionDemo {
    public static void main(String[] args) {
        easyCheck();
        System.out.println();
        RecursionPrintInOutExplanation.f(1);
    }

    private static void easyCheck() {
        f_version1(1);
        System.out.println();
        f_version2(1);
        System.out.println();
        fDequeRecursion(1);
    }

    private static void f_version1(int arg) {
        System.out.print(" " + arg);
        if (arg < 7) {
            f_version1(2 * arg);
        }
    }

    private static void f_version2(int arg) {
        if (arg < 7) {
            f_version2(2 * arg);
        }
        System.out.print(" " + arg);
    }

    private static void fDequeRecursion(int arg) {
        System.out.print(" " + arg);
        if (arg < 7) {
            fDequeRecursion(2 * arg);
        }
        System.out.print(" " + arg);
    }
}
