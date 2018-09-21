package strings;

import java.util.HashMap;

class SuperClass {
    void call() {
        System.out.println("Super call");
    }

    void callParent() {
        System.out.println("Super parent call");
    }
}

class SubClass extends SuperClass {
    void call() {
        System.out.println("Sub call");
    }

    void callParent() {
        System.out.println("Sub parent call");
    }
}

class Entity {
    String name;
    int number;

    Entity(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public int hashCode() {
        return (name + number).hashCode();
    }
}

public class StringParsingDemo {

    public static void main(String[] args) {
        Entity first = new Entity("WOW", 17);
        Entity second = new Entity("UFO", 17);

        HashMap<Entity, String> map = new HashMap<>();
        map.put(first, "RSR-1089");
        System.out.printf("Map hash: %s\n", map.keySet().hashCode());

        System.out.printf("First hash: %s\n", first.hashCode());
        System.out.printf("Second hash: %s\n", second.hashCode());
        System.out.println();
        System.out.println(map.containsKey(first));
        System.out.println(map.containsKey(second));

        first.name = "UFO";

        System.out.println();

        System.out.printf("Map hash 2: %s\n", map.keySet().hashCode());
        System.out.printf("First hash: %s\n", first.hashCode());
        System.out.printf("Second hash: %s\n", second.hashCode());
        System.out.println();
        System.out.println(map.containsKey(first));
        System.out.println(map.containsKey(second));


//        System.out.println(printFirstVariant("75", "25"));
//        System.out.println(printSecondVariant("75", "25"));

//        SuperClass supCl = new SubClass();
//        supCl.call();
//        supCl.callParent();
//
//
//        SuperClass subCl = new SuperClass();
//        subCl.call();
//        subCl.callParent();
    }

    private static Integer printFirstVariant(String first, String second) {
        return Integer.parseInt(first + second);
    }

    private static String printSecondVariant(String first, String second) {
        return Integer.valueOf(first + second).toString();
    }
}
