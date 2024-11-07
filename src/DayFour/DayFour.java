package DayFour;

import java.util.Arrays;

public class DayFour {

    // TODO - Exercise 5: Multiplication Table

    public static void main(String[] args) {
        multiplicationTable();
    }

    private static void multiplicationTable() {
        int n = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}