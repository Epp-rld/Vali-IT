package DayFour;

import java.util.Arrays;

public class DayFour {

    public static void main(String[] args) {
        for (int count =1; count <= 5; count ++) {
            if (count ==3) { // Check if count is 3.
                break; // Exit the loop if count is 3.
            }
            System.out.println("Well done, we found Markus on the list.");
            System.out.println("Count is: " + count); // Print count if it's not 3.
        }
    }
}