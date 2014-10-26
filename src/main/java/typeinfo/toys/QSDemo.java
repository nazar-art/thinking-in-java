package typeinfo.toys;

class Quicksort {
    public static void qsort(char[] array) {
        qs(array, 0, array.length - 1);
    }

    private static void qs(char[] items, int left, int right) {
        int i = left, j = right;
        char x, y;

        x = items[(left + right) / 2];

        do {
            while ((items[i] < x) && (i < right)) i++;
            while ((x < items[j]) && (j > left)) j--;

            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }
        } while (i <= j);

        if (left < j) qs(items, left, j);
        if (i < right) qs(items, i, right);
    }

}

public class QSDemo {

    public static void main(String[] args) {
        char[] a = {
                'd', 'c', 'k', 'h', 'f', 'e', 'b', 'g', 'a', 'e', 'l', 'm', 'n'
        };
        System.out.println("Original array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        Quicksort.qsort(a);
        System.out.println("Sorted array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
