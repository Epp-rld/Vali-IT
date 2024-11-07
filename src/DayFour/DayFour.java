package DayFour;

import java.util.Arrays;

public class DayFour {

    public static void main(String[] args) {
        System.out.println("You rolled a number: " + rollDice());
    }

    private static int rollDice() {
            return (int) (Math.random() * 6) + 1;
        }
    }