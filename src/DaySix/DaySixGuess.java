package DaySix;

import java.util.Scanner;

public class DaySixGuess {
    // Exercise 3: Guess the number
    // Write a program that asks a user to guess a number between 1 and 50.
    // The program should continue to prompt the user until the correct number is guessed.
    // If the guess is not correct, print a msg saying "Try again!"
    // Otherwise print "Correct!"
    // The program should use != to check if the guess is wrong.
    // Hint: Set the max number of attempts: int maxAttempts

    public static void main(String[] args) {
        int rightNumber = 37; // Target number to guess.
        int guessNumber = 0; // Variable to store user's guess.
        Scanner sc = new Scanner(System.in);
        int maxAttempts = 5; // Max number of attempts allowed.
        int attempts = 0; // Counter for attempts used.

        while ((guessNumber != rightNumber) && (attempts < maxAttempts)) {
            System.out.println("Enter the number from 1 to 50 you wish to guess: ");
            guessNumber = sc.nextInt(); // Ei tohi olla loop'ist väljaspool.
            // Muidu kasutatakse iga tsükliga sama kasutajasisendit.
            attempts++;

            System.out.println("You guessed " + guessNumber);
            System.out.println("You have used " + attempts + " out of " + maxAttempts + " attempts.");

            if (guessNumber != rightNumber) { // või: if(!(guessNumber == rightNumber))
                System.out.println("Try again!");
            } else {
                System.out.println("Correct! You win!");
            }
        }
        // Check if the user ran out of attempts.
        if (guessNumber != rightNumber) {
            System.out.println("Zero attempts left! Game over!");
        }
        sc.close();
    }
}