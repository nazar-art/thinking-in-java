package net.lelyak.typeinfo.toys;

import java.util.*;

/*
 * Exercise 3: (2) Add Rhomboid to Shapes.java. Create a Rhomboid, upcast it to a
	Shape, then downcast it back to a Rhomboid. Try downcasting to a Circle and see what
	happens.
	Exercise 4: (2) Modify the previous exercise so that it uses instanceof to check the type
	before performing the downcast.
 */

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {
    @Override
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(),
                new Triangle(), new Rhomboid());
        for (Shape shape : shapeList)
            shape.draw();
    }
}
