package net.lelyak.courses.io.encoding.utf;

import java.nio.charset.Charset;
import java.nio.charset.spi.CharsetProvider;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ServiceLoader;

public class ServiceLoaderDemo {
    public static void main(String[] args) {
        System.out.println("START");
        ServiceLoader<CharsetProvider> load = ServiceLoader.load(CharsetProvider.class);
        for (CharsetProvider elem : load) {
            List<Charset> list = new LinkedList<>();
            for (Iterator<Charset> iter = elem.charsets(); iter.hasNext(); ) {
                list.add(iter.next());
            }
            System.out.println(list);
            System.out.println(list.size());
        }
        System.out.println("FINISH");
    }
}
