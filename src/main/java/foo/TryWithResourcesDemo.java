package foo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {

    private static String readFirstLine(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            System.out.printf("Exception occurred: %s\n", e.getMessage());
            return "auto stub";
        }
    }


    public static void main(String[] args) {
        System.out.printf("First line from file: %s\n", readFirstLine("NoSuchFile.txt"));
    }

}
