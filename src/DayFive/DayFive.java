package DayFive;
import java.util.ArrayList;
import java.util.List;

// Exercise 2 - Removing Elements from a List in a Loop
//The code below attempts to remove all even numbers from a list of Integers. However, it throws an IndexOutOfBoundsException.

public class DayFive {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        for (int i = numbers.size()-1; i >= 0; i--) { // Alustame lugemist 10st allapoole. Lisasime -1,
            // seega ei alusta nüüd enam 10. kohalt, vaid seame alguseks -10.
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }

        System.out.println("List after removing even numbers: " + numbers);
    }
    }