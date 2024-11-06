package DayThree;

public class DayThree {

    public static void main(String[] args) {
        getUser();
    }

    // Lisame meetodi, mis prindib ekraanile Hello.

    private static void getUser() {
        boolean isTrue = true;
        System.out.println("Hello");
        if (isTrue) {
            getName();
        }
    }
        private static void getName() {
            boolean isTrue = true;
            System.out.println("John");
            if (isTrue) {
                getPassword();
            }
        }
        private static void getPassword () {
            System.out.println("Password");
        }
    }