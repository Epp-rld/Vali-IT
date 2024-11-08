package DayFive;
import java.util.ArrayList;
import java.util.List;

public class DayFive {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        listOfNumbers.add(10);
        listOfNumbers.add(20);
        listOfNumbers.add(30);

        for (int i = 0; i < listOfNumbers.size(); i++) {
            System.out.println("Element at index " + i + ": " + listOfNumbers.get(i));
        }
    }
}