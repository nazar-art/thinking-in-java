package foo;

class OuterClass {
    static class StaticInnerClass {
        public StaticInnerClass() {
            System.out.println("Static inner class instance created");
        }
    }

    class InnerClass {
        public InnerClass() {
            System.out.println("Inner class instance created");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
    }
}
