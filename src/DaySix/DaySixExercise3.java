package DaySix;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

// Exercise 3 – Remove a Key-Value Pair
// Create a Map that stores employee names and their salaries.
// Write a program to remove an employee from the map by name and print the updated map.
// Hint: Use Map method remove( ) using the key

public class DaySixExercise3 {
    public static void main(String[] args) {
        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("Mati", 3000);
        salaries.put("Jan", 5000);
        salaries.put("Mari", 4000);
        salaries.put("Malle", 7000);
        salaries.put("Toomas", 6000);
        salaries.put("Alex", 8000);
        System.out.println("Employee list before name removal: " + salaries);

        String employeeToRemove = "Toomas";
        salaries.remove(employeeToRemove);

        System.out.println("Employee list after name removal: " + salaries);
    }
}