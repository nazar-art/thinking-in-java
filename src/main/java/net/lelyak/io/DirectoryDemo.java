package net.lelyak.io;

import java.io.*;

import net.lelyak.mindview.util.*;

import static net.lelyak.mindview.util.Print.*;

public class DirectoryDemo {
    public static void main(String[] args) {
        // All directories:
        System.out.println("All directories:");
        PPrint.pprint(Directory.walk(".").dirs);

        // All files beginning with 'T'
        System.out.println("All files beginning with 'T':");
        for (File file : Directory.local(".", "T.*"))
            print(file);
        print("----------------------");

        // All Java files beginning with 'T':
        System.out.println("All Java files beginning with 'T':");
        for (File file : Directory.walk(".", "T.*\\.java"))
            print(file);
        print("======================");

        // Class files containing "Z" or "z":
        System.out.println("Class files containing \"Z\" or \"z\":");
        for (File file : Directory.walk(".", ".*[Zz].*\\.class"))
            print(file);
    }
}