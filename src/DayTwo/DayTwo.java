package DayTwo;

import java.util.Scanner;

public class DayTwo {

    public static void main(String[] args) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        num1 = sc.nextDouble();

        System.out.println("Enter the second number:" );
        num2 = sc.nextDouble();

        System.out.println("Enter the operator (+,-,*,/):");
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        }

    }