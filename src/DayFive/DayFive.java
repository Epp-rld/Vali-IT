package DayFive;

public class DayFive {

    // TODO - Print the Sum of Non-Negative Numbers Until a Negative NUmber is Found
    // TODO - Given an array of numbers, use a for loop to calculate
    //  the sum of all non-negative numbers.
    // TODO - Stop the loop when a negative number is encountered.
    // TODO - Hint: int[] numbers {5, 12, 3, 7, -4, 8, 2}


    public static void main(String[] args) {
        SumOfNonNegativeNumbers();

    }

    private static void SumOfNonNegativeNumbers() {
        int[] numbers = {5, 12, 3, 7, -4, 8, 2};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {// Check for non-neg and accumulative sum.
            if (numbers[i] >= 0) {
                sum += numbers[i];
            } else {
                break; // Exit the loop when a neg number is found.
            }
        }
        System.out.println("The sum is: " + sum);
    }
}