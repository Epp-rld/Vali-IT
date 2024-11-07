package DayFour;

import java.util.Arrays;

public class DayFour {

    // TODO - Exercise 4: Sum of Numbers - välja kutsuda main meetodist

    public static void main(String[] args) {
        evenNumbersBetweenOneAndTwenty();
    }

    private static void evenNumbersBetweenOneAndTwenty() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}