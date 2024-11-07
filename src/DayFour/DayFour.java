package DayFour;

import java.util.Arrays;

public class DayFour {

    // TODO - Exercise 1: Declare and initialize an array:
    // TODO - Declare an integer array of size 5 and initialize it with values: {1, 2, 3, 4, 5}.
    // TODO - Hint: Use int[] myArray = {1, 2, 3, 4, 5}.

    public static void main(String[] args) {
        int [] myArray = {0, 1, 2, 3, 4};
        myArray[0]++;
        myArray[1]++;
        myArray[2]++;
        myArray[3]++;
        myArray[4]++;

        System.out.println(Arrays.toString(myArray));
    }
}
