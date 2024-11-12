package DaySeven;
// Ex 2: Check if a person is eligible to vote
// Write a program that takes a person's age and uses the ternary operator to determine
// if the person is eligible to vote (18 or older).
// If eligible, the program should print "Eligible to vote"; otherwise, it should print "Not eligible to vote.".
// Input: age = 17 --> expected output "Not eligible to vote. / Input: age 20 --> Expected output "Eligible to vote".
import java.util.Scanner;

public class DaySevenTernaryOperatorExercise2 {
    public static void main(String[] args) {
        System.out.println("Enter age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        System.out.println(" ");

        String eligibleToVote = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(eligibleToVote);
        sc.close();
    }
}