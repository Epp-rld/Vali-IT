package DayTwo;

import java.util.Scanner;

public class DayTwo {

    public static void main(String[] args) {

        //  Write a Java program that takes three numbers from the user and prints the greatest number.

        double num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        num1 = sc.nextDouble();
        System.out.println("Enter the second number:");
        num2 = sc.nextDouble();
        System.out.println("Enter the third number:");
        num3 = sc.nextDouble();

        if (num1 >= num2 && num1 >= num2) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3 + " is the largest number.");
        }
    }
}