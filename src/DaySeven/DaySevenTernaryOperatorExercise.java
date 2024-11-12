package DaySeven;
// Ternary operator - condition ? expressionIfTrue : expressionIfFalse;
// Ex 1: Find the maximum of two numbers
// Write a program that takes two numbers and uses the ternary operator
// to find and display the maximum of the two numbers.
// Example: input: num1 = 10, num2 = 20
// Expected output: "The maximum number is 20".

import java.util.Scanner;

public class DaySevenTernaryOperatorExercise {
    public static void main(String[] args) {

        System.out.println("Insert first number: ");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();

        System.out.println(" ");

        System.out.println("Insert second number: ");
        int number2 = sc.nextInt();

        System.out.println(" ");

        int max = number1 > number2 ? number1 : number2;
        System.out.println("The maximum number is " + max + ".");
    }
}
