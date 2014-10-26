package typeinfo.reflection;

import java.lang.reflect.Constructor;

/*
 * Exercise 19: (4) In ToyTest.java, use reflection to create a Toy object using the non-
 default constructor.
 */

class SuperToy {

    int IQ;

    public SuperToy(int inteligiance) {
        IQ = inteligiance;
    }

    @Override
    public String toString() {
        return "I'm super toy, I'm smarter than you!";
    }

}

public class Ex_19_ToyTest {

    public static SuperToy makeToy(String toyName, int IQ) {
        try {
            Class<?> tClass = Class.forName(toyName);
            for (Constructor<?> ctor : tClass.getConstructors()) {

                // Look for a constructor with a single parameter:
                Class<?>[] params = ctor.getParameterTypes();

                if (params.length == 1)
                    if (params[0] == int.class)
                        return (SuperToy) ctor
                                .newInstance(new Object[]{Integer.valueOf(IQ)});
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(makeToy("typeinfo.reflection.SuperToy", 150));
    }
}
