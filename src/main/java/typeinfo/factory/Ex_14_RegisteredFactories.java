package typeinfo.factory;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*
 * Exercise 14: (4) 
 * A constructor is a kind of factory method. Modify RegisteredFactories.java 
 * so that instead of using an explicit factory, the class object is
 stored in the List, and newlnstance( ) is used to create each object.
 */

class Part2 {
    private static Random random = new Random(47);

    static List<Class<? extends Part2>> partClasses = Arrays.asList(
            FuelFilter2.class, AirFilter2.class, CabinAirFilter2.class,
            OilFilter2.class, FanBelt2.class, PowerSteeringBelt2.class,
            GeneratorBelt2.class);

    public String toString() {
        return getClass().getSimpleName();
    }

    public static Part2 createRandom() {
        int n = random.nextInt(partClasses.size());
        try {
            return partClasses.get(n).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException();
        }
    }
}

class Filter2 extends Part2 {
}

class FuelFilter2 extends Filter2 {
}

class AirFilter2 extends Filter2 {
}

class CabinAirFilter2 extends Filter2 {
}

class OilFilter2 extends Filter2 {
}

class Belt2 extends Part2 {
}

class FanBelt2 extends Belt2 {
}

class GeneratorBelt2 extends Belt2 {
}

class PowerSteeringBelt2 extends Belt2 {
}

public class Ex_14_RegisteredFactories {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Part2.createRandom());
        }
    }
}
