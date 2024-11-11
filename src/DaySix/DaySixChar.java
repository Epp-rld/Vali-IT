package DaySix;
import java.util.ArrayList;
import java.util.List;

public class DaySixChar {
    public static void main(String[] args) {
        // Step 1: Initialize the list to store letters
        List<Character> letters = new ArrayList<>();

        // Step 2: Add characters from 'a' to 'z' to the list
        for (char ch = 'a'; ch <= 'z'; ch++) {
            letters.add(ch);
        }

        // Step 3: Print the list of letters
        System.out.println(letters);
    }
}