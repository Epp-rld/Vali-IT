package DaySix;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;

public class DaySixMapHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); // Loome uue mapi, mis näitab mis tüüpi key on, mis tüüpi value on.
        map.put("Mati", 25);
        map.put("Kati", 30);
        map.put("Tõnu", 35);

        for (String key : map.keySet()) {
            System.out.println(key);
        }
        for (Integer value : map.values()) {
            System.out.println(value);
        }
        System.out.println(" ");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
