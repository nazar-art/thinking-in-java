package net.lelyak.typeinfo.toys;

import java.util.Arrays;
import java.util.List;

public class Ex_03_Rhomboid {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
        for (Shape shape : shapes)
            shape.draw();
        // Upcast to shape:
        Shape shape = new Rhomboid();
        // Downcast to Rhomboid:
        Rhomboid r = null;
        r = (Rhomboid) shape;
        System.out.println();
        r.draw();
        // Downcast to Circle. Succeeds at compile time,
        // but fails at runtime with a ClassCastException:
        // ! Circle c = (Circle)shape;
    }
}
