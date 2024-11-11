package DaySix;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class DaySixMapExercise2 {
    // Ex 2: Create a map where the key is a student name (String) and the value is their grade (Integer).
    // Add a few student names and grades, then retrieve and print a student's grade based on their name.
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Mari", 7);
        map.put("Mati", 9);
        map.put("Taavi", 6);
        map.put("Eeva", 10);
        map.put("Hannes", 8);

        System.out.println("Student grades: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = sc.nextLine();

        // Retrieve and print the student's grade if they are in the map
        Integer grade = map.get(name);
        if (grade != null) {
            System.out.println(name + "'s grade: " + grade);
        } else {
            System.out.println("Student " + name + " not found.");
        }
        // Close the scanner
        sc.close();
    }
}