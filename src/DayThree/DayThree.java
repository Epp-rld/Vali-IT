package DayThree;

public class DayThree {

    public static void main(String[] args) {
    boolean checkIfNumberIsEven = isEven(4);
        System.out.println(checkIfNumberIsEven);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}