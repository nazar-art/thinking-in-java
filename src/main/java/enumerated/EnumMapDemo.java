package enumerated;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        EnumMap<AlarmPoints, String> enumMap = new EnumMap<>(AlarmPoints.class);

        enumMap.put(AlarmPoints.KITCHEN, "Kitchen");
        enumMap.put(AlarmPoints.KITCHEN, "One more kitchen");

        enumMap.put(AlarmPoints.BATHROOM, "Bath rome");
        enumMap.put(AlarmPoints.BATHROOM, "Rest rome");

        for (Map.Entry<AlarmPoints, String> entry : enumMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
