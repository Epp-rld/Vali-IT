
public class DayOne {
    public static void main(String[] args) {

        int a = 5;
        int b = -7;

        //TODO - use && (AND)
        //TODO - use || (OR)

        //TODO - print out "b is bigger than a"
        //TODO - print out "a is bigger than b" in else if block
        //TODO - print out "a and b are equal" in else block
        //TODO - print out "No specific conditions were met"


        //Task 2

        if (b > a && a > 0) {
            System.out.println("b is bigger than a, and a is positive");
        } else if (b < a && b > 0) {
            System.out.println("a is bigger than b, and b is positive");
        } else if (b == a || b < 0 && a < 0) {
            System.out.println("a and b are either equal or both are negative ");
        } else {
            System.out.println("No specific conditions were met");
        }


    }
}