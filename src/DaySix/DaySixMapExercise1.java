package DaySix;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class DaySixMapExercise1 {
    // Exercise 1: Add user to map
    // Create a new map and add 2 new users.
    // Print out user name and job position.

    public static void main(String[] args) {
        Map<String, String> mapOfJobs = new HashMap<>();
        mapOfJobs.put("Mati", "CEO");
        mapOfJobs.put("Kati", "Developer");

       /*  for (String keyName : mapOfJobs.keySet()) {
            System.out.println(keyName);
        }
        for (String value : mapOfJobs.keySet()) {
            System.out.println(value);
        }
        System.out.println(" "); */ // Seda siin pole vaja.

        for (Map.Entry<String, String> entry : mapOfJobs.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
