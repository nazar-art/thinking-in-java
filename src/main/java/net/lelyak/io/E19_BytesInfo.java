/****************** Exercise 19 *****************
 * Using BinaryFile and a Map<Byte,Integer>, create
 * a program that counts the occurrence of all the
 * different bytes in a file.
 ***********************************************/
package net.lelyak.io;

import net.lelyak.mindview.util.BinaryFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E19_BytesInfo {

    public static void main(String[] args) throws IOException {

        Map<Byte, Integer> bytesStat = new HashMap<>();
        for (Byte bt : BinaryFile.read("./target/classes/net/lelyak/io/E19_BytesInfo.class")) {
            bytesStat.compute(bt, (k, freq) -> freq == null ? 1 : freq + 1);
        }

        List<Byte> keys = new ArrayList<>(bytesStat.keySet());
        Collections.sort(keys);
        for (Byte key : keys)
            System.out.println(key + " => " + bytesStat.get(key));
    }
}
