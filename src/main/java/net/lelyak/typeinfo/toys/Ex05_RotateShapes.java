package net.lelyak.typeinfo.toys;

import java.util.Arrays;
import java.util.List;

abstract class RShape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();

    void rotate(int degrees) {
        System.out.println("Rotating " + this + " by " + degrees + " degrees");
    }
}

class RCircle extends RShape {
    public String toString() {
        return "Circle";
    }
}

class RSquare extends RShape {
    public String toString() {
        return "Square";
    }
}

class RTriangle extends RShape {
    public String toString() {
        return "Triangle";
    }
}

class RRhomboid extends RShape {
    @Override
    public String toString() {
        return "Rhomboid";
    }
}

public class Ex05_RotateShapes {
    static void rotateAll(List<RShape> list) {
        for (RShape shape : list) {
            if (!(shape instanceof RCircle)) {
                shape.rotate(45);
            }
        }
    }

    public static void main(String[] args) {
        List<RShape> shapesList = Arrays.asList(new RCircle(), new RSquare(),
                new RTriangle(), new RRhomboid());
        rotateAll(shapesList);
    }
}
