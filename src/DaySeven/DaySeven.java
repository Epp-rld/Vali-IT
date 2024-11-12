package DaySeven;

public class DaySeven {
    public static void main(String[] args) {
        int number = 7;

        String result = (number % 2 == 0) ? "Even" : "Odd"; // Pärast jutumärke: if...then...elseSh
        System.out.println("The number is " + number + " is " + result);
    }
}