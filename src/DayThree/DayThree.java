package DayThree;

public class DayThree {

    public static void main(String[] args) {
        getPerson();

        // getAge(); võiks olla ka private static void getName() skoobis.
    }
    // Lisame meetodi, mis prindib ekraanile Hello.

    // TODO - Loo uus meetod private static void getName() ja kutsu main meetodist välja
    // TODO - getName() meetodi sees prindi konsooli "John"

    private static void getPerson() {
        System.out.println("Checking user details:");
        getName();
        checkUserAge();
    }

    private static void getName() {
        System.out.println("John");
        // getAge(); võiks olla ka siin.
    }

    private static void checkUserAge() {
        int age = 15;
        if (age < 18) {
            System.out.println("You are younger than 18 years.");
        } else {
            getAge();
        }
    }

        private static void getAge() {
        System.out.println("Age is: 30");
    }
}