package DayFour;

import java.util.Arrays;

public class DayFour {

    // TODO - Exercise 5: Multiplication Table
    // TODO - Write a program that uses a for loop to print the multiplication table of 7.
    // TODO - Provide the table up to 7 x 10 = 70, meaning limit loop to repeat 10 times.
    // TODO - Hint: Wjen printing the results, use variables values and Strings.

    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= 10; i++) {

                System.out.println(n + " x " + i + " = " + n * i);
            }
        }
    }
