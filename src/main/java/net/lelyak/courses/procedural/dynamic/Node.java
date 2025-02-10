package net.lelyak.courses.procedural.dynamic;

public class Node {
    public int value;
    public Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public static Node $(int value) {
        return $(value, null);
    }

    public static Node $(int value, Node next) {
        return new Node(value, next);
    }

    public static String toString(Node tail) {
        String result = "";
        for (; tail != null; tail = tail.next){
            result += tail.value + "->";
        }
        return result + "*";
    }

    public static Node _(int... values) {
        Node tail = null;
        for (int k = values.length - 1; k >= 0; k--) {
            tail = new Node(values[k], tail);
        }
        return tail;
    }

    public static Node copy(Node tail) {
        return tail == null ? null : new Node(tail.value, copy(tail.next));
    }

    public static boolean isEqual(Node t0, Node t1) {
        if (t0 != null && t1 != null) {
            return (t0.value == t1.value) && isEqual(t0.next, t1.next);
        } else {
            return t0 == t1;
        }
    }

    public static Node generate(int length) {
        return (length == 0) ? null : new Node(length, generate(length - 1));
    }

    public static String toStringEasy(Node tail) {
        return (tail == null) ? "*" : tail.value + "->" + toString(tail.next);
    }

    public static Node merge(Node tailA, Node tailB) {
        if (tailA != null && tailB != null) {
            if (tailA.value < tailB.value) {
                return new Node(tailA.value, merge(tailA.next, tailB));
            } else {
                return new Node(tailB.value, merge(tailA, tailB.next));
            }
        } else {
            return (tailA == null) ? tailB : tailA;
        }
    }

    private static boolean hasLoop(Node node) {
        Node nextNode = node.next;
        while (node != nextNode && nextNode != null) {
            node = node.next;
            nextNode = ((nextNode.next == null) ? null : nextNode.next.next);
        }
        return node == nextNode;
    }

    public static void main(String[] args) {
        Node tail = $(3, $(2, $(1, $(0))));
        System.out.println(toString(tail));
    }
}