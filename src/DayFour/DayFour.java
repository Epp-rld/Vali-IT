package DayFour;

public class DayFour {

    // TODO - Exercise 2: Print odd numbers from 1 to 20, skip multiples of 5
    // TODO - Use a for loop to print all odd numbers between 1 and 20.
    // TODO - If a number is a multiple of 5, skip it using continue.

    public static void main(String[] args) {
        skipMultiplesOfFive();

    }

    private static void skipMultiplesOfFive() {
        for (int i = 1; i <= 20; i += 2) { // Only iterate odd numbers
            // skip numbers that are multiples of five.
            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}