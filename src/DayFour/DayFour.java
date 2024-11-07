package DayFour;

import java.util.Arrays;

public class DayFour {

    // TODO - Exercise 4: Even numbers between 1 and 20
    // TODO - Write a program that uses a for loop to print all the even numbers between 1 and 20.
    // TODO - Hint: For incrementing use: i += 1 (1 is just an example, use a correct value instead).

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
