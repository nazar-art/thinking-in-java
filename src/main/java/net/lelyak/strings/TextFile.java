package net.lelyak.strings;

//Static functions for reading and writing text files as
//a single string, and treating a file as an ArrayList.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

//@SuppressWarnings("serial")
public class TextFile extends ArrayList<String> {

    // Read a file as a single string:
    public static String read(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            try (BufferedReader in = new BufferedReader(new FileReader(new File(fileName).getAbsoluteFile()))) {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    // Write a single file in one method call:
    public static void write(String fileName, String text) {
        try (PrintWriter out = new PrintWriter(
                new File(fileName).getAbsoluteFile())
        ) {
            out.print(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Read a file, split by any regular expression:
    public TextFile(String fileName, String splitter) {
        super(Arrays.asList(read(fileName).split(splitter)));
        // Regular expression split() often leaves an empty
        // String at the first position:
        if (get(0).equals(""))
            remove(0);
    }

    // Normally read by lines:
    public TextFile(String fileName) {
        this(fileName, "\n");
    }

    public void write(String fileName) {
            try (PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile())) {
                for (String item : this)
                    out.println(item);
            } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Simple test:
    public static void main(String[] args) {
        String file = read("hs_err_pid4228.log");
        write("test.txt", file);
        TextFile text = new TextFile("test.txt");
        text.write("test2.txt");
        // Break into unique sorted list of words:
        TreeSet<String> words = new TreeSet<>(new TextFile("hs_err_pid4228.log", "\\W+"));
        // Display the capitalized words:
        System.out.println(words.headSet("a"));
    }
}