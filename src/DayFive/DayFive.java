package DayFive;

public class DayFive {

    // TODO -/  Exercise 5: Find the first number greater than 50 in an array
    // TODO - Given an array of numbers, use a loop to find the first number greater than 50.
    // TODO - Print it and exit the loop immediately after.
    // TODO - int[] numbers = {23, 45, 39, 51, 48, 60};

    public static void main(String[] args) {
        firstGreaterThanFifty();

    }

    private static void firstGreaterThanFifty() {
        int[] numbers = {23, 45, 39, 51, 48, 60};

        for (int num : numbers) {
            if (num > 50) {
                System.out.println("The first number over 50 is: " + num);
                break;
            }
        }
    }
}