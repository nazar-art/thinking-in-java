package net.lelyak.enumerated;

//: net.lelyak.enumerated/TrafficLight.java
//Enums in switch statements.

import static net.lelyak.mindview.util.Print.*;
import static net.lelyak.enumerated.Signal.*;
/* Exercise 1: (2) Use a static import to modify TrafficLight.java so you don’t have to
 *  qualify the enum instances.
*/

public class TrafficLight {
    Signal color = Signal.RED;

    public void change() {
        switch (color) {
            // Note that you don't have to say Signal.RED
            // in the case statement:
            case RED:
                color = GREEN;
                break;
            case GREEN:
                color = YELLOW;
                break;
            case YELLOW:
                color = RED;
                break;
        }
    }

    public String toString() {
        return "The traffic light is " + color;
    }

    public static void main(String[] args) {

        TrafficLight t = new TrafficLight();
        for (int i = 0; i < 7; i++) {
            print(t);
            t.change();
        }
    }
} 

