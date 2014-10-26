package enumerated;

import java.util.*;

import static enumerated.AlarmPoints.*;
import static net.mindview.util.Print.*;

interface Commands {
    void action();
}

public class EnumMaps {

    public static void main(String[] args) {
        EnumMap<AlarmPoints, Commands> em = new EnumMap<AlarmPoints, Commands>(
                AlarmPoints.class);
        em.put(KITCHEN, new Commands() {
            public void action() {
                print("Kitchen fire!");
            }
        });

        em.put(BATHROOM, new Commands() {
            public void action() {
                print("Bathroom alert!");
            }
        });

        for (Map.Entry<AlarmPoints, Commands> e : em.entrySet()) {
            printnb(e.getKey() + ": ");
            e.getValue().action();
        }

        try { // If there's no value for a particular key:
            em.get(UTILITY).action();
        } catch (Exception e) {
            print(e);
        }
    }
}