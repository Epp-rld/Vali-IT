package DayFour;

public class DayFour {

    // TODO - Exercise 1: Find the first even number in a list
    // TODO - Given an array of numbers, use a for loop to find the first even number in the array
    // TODO - Once you find it, print it and exit the loop.

    public static void main(String[] args) {
        firstEvenNumber();

    }

    private static void firstEvenNumber() {
        int[] myArray = {1, 3, 7, 4, 9, 10};
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                System.out.println("The first even number is: " + myArray[i]);
                break;
            }
        }
    }
}