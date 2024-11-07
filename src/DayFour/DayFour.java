package DayFour;

import java.util.Arrays;

public class DayFour {

    // TODO - Exercise 3: Modify an Element:
    // TODO - Task: Given an array {5, 10, 15, 20}, change the second element to 12
    //  TODO - ... and print the entire array to see the change.
    //  TODO - Hint: Assign a new value to array[1], then print the elements individually.


    public static void main(String[] args) {
        int [] myArray = {5, 10, 15, 20};
        myArray[1]++;
        myArray[1]++;

        System.out.println(myArray[1]);
    }
}
