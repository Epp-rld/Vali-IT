package DayThree;

import java.util.Arrays;

public class DayThree {

    public static void main(String[] args) {
        String[] carBrand = {"Tesla", "Honda", "Audi"};
        String[] carModel =  {"Model S", "Civic", "A3"};

        Arrays.sort(carBrand); // Järjestab autobrändid tähestiku järjekorras
        System.out.println(Arrays.toString(carBrand));

        System.out.println(carBrand[1] + " " + carModel[1]);
    }
}