package DayFour;

import java.util.Arrays;

public class DayFour {

    // Alternatiivne lahendus - Exercise 3: Modify an Element

    public static void main(String[] args) {
        int count = 1; // Loome int-tüüpi muutuja algväärtusega 1.
        while (count <= 5) { // Alati väiksem või võrdne kui 5.
            // Määrame, kui kaua tahame, et koodiplokk käiks.
            System.out.println("Count is: " + count);
            count++; // Alustab 1-st ja uuel ringil prindib konsooli 2, järgmisel real 3 jne.
            // Tsükkel lõpetatakse 5-ga.
            System.out.println("Count is after count++: " + count);
            //Prindib välja ka muutuja väärtuse igal hetkel.
        }

    }
}
