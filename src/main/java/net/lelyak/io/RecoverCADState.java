package net.lelyak.io;

import java.io.*;
import java.util.*;

public class RecoverCADState {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(Location.LOC + "CADState.out"));

        // Read in the same order they were written:
        @SuppressWarnings("unused")
        List<Class<? extends Shape>> shapeTypes = (List<Class<? extends Shape>>) in.readObject();
        Line.deserializeStaticState(in);

        List<Shape> shapes = (List<Shape>) in.readObject();
        System.out.println(shapes);
    }
}
