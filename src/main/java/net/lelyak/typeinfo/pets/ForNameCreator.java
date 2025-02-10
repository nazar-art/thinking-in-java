package net.lelyak.typeinfo.pets;

import java.util.*;

public class ForNameCreator extends PetCreator {

    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();

    // Types that you want to be randomly created:
    private static String[] typeNames = {"net.lelyak.typeinfo.pets.Mutt",
            "net.lelyak.typeinfo.pets.Pug", "net.lelyak.typeinfo.pets.EgyptianMau",
            "net.lelyak.typeinfo.pets.Manx", "net.lelyak.typeinfo.pets.Cymric", "net.lelyak.typeinfo.pets.Rat",
            "net.lelyak.typeinfo.pets.Mouse", "net.lelyak.typeinfo.pets.Hamster", "net.lelyak.typeinfo.pets.Gerbil"};

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames)
                types.add((Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }
}