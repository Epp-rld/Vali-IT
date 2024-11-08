package DayFive;
import java.util.ArrayList;
import java.util.List;

public class DayFive {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Alex");
        listOfNames.add("Bob");
        listOfNames.add("Charlie");

        System.out.println(listOfNames);

        for (String name : listOfNames) {
            System.out.println(name);
        }

        listOfNames.remove(1); // Eemaldame ühe elemendi ehk antud juhul Bobi.

        System.out.println(" ");

        System.out.println("Print out name: " + listOfNames.get(0));
        System.out.println("Print out name: " + listOfNames.get(1));

        listOfNames.set(1, "John"); // Asendame nime 1. positsioonil ehk Bobi Johniga.

        System.out.println("Names after modification: " + listOfNames);

    }
}
