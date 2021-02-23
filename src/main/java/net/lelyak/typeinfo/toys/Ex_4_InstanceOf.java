package net.lelyak.typeinfo.toys;

public class Ex_4_InstanceOf {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Shape shape = new Rhomboid();
        Rhomboid rhomboid = (Rhomboid) shape;

        Circle c = null;
        if (shape instanceof Circle) {
            c = (Circle) shape;
        } else {
            System.out.println("Can't instantiate circle");
        }
    }
}
