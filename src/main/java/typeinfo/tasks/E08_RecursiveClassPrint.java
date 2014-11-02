package typeinfo.tasks;

import static net.mindview.util.Print.print;

/**
 * *************** Exercise 8 ******************
 * Write a method that takes an object and
 * recursively prints all the classes in that
 * object's hierarchy.
 * *********************************************
 */
public class E08_RecursiveClassPrint {

    static void printClasses(Class<?> c) {
        if (c == null) return;
        print(c.getName());
        for (Class<?> cl : c.getInterfaces()) {
            print("Interface: " + cl.getName());
            printClasses(cl.getSuperclass());
        }
        printClasses(c.getSuperclass());
    }

    public static void main(String[] args) throws ClassNotFoundException {
        for (int i = 0; i < args.length; i++) {
            print("Displaying " + args[i]);
            printClasses(Class.forName(args[i]));
            if (i < args.length - 1)
                System.out.println("==================");
        }
    }
}
