package enumerated;

import java.util.*;

import static enumerated.AlarmPoints.*;
import static net.mindview.util.Print.*;

interface Commands {
    void action();
}

public class EnumMaps {

    public static void main(String[] args) {
        Map<AlarmPoints, Commands> em = new EnumMap<>(AlarmPoints.class);

        em.put(KITCHEN, () -> print("Kitchen fire!"));

        em.put(BATHROOM, () -> print("Bathroom alert!"));

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