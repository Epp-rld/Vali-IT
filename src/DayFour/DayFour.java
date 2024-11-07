package DayFour;

import java.util.Arrays;

public class DayFour {

    // TODO - Exercise 3: Sum of numbers
    // TODO - Write a program that uses a while loop to calculate the sum of the first 100 positive integers.
    // TODO - Hint: while (<boolean expression> {}

    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        while (count <= 100) {
            sum += count;
            count++;
        }
        System.out.println(sum);
    }
}
