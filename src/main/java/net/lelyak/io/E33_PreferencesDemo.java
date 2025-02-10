/****************** Exercise 33 *****************
 * Write a program that displays the current value
 * of a directory called "base directory" and
 * prompts you for a new value. Use the Preferences
 * API to store the value.
 ***********************************************/
package net.lelyak.io;

import java.util.*;
import java.util.prefs.*;

import static net.lelyak.mindview.util.Print.*;

public class E33_PreferencesDemo {

    public static void main(String[] args) throws Exception {

        Preferences prefs = Preferences.userNodeForPackage(E33_PreferencesDemo.class);
        String directory = prefs.get("base directory", "Not defined");
        print("directory: " + directory);

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        printnb("Enter a new directory: ");

        directory = sc.nextLine();
        prefs.put("base directory", directory);
        print("\ndirectory: " + directory);
    }
}
