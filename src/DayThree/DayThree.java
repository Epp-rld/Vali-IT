package DayThree;

import java.util.Arrays;

public class DayThree {

    public static void main(String[] args) {
        String[] carBrand = {"Tesla", "Honda", "Audi"};
        String[] carModel =  {"Model S", "Civic", "A3"};

        carModel[0] = "Model 3";

        Arrays.sort(carBrand);
        System.out.println(Arrays.toString(carBrand));

        System.out.println(carBrand[1] + " " + carModel[1]);
    }
}