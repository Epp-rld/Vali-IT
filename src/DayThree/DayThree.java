package DayThree;

public class DayThree {

    public static void main(String[] args) {
        int id = 1;
        getUser(id);
    }

    private static void getUser(int id) {
        getUserFullName(id);
        getUserAge(id);
    }

    private static String getUserFullName(int userID) {
        // Simulate fetching from database
        System.out.println("Name");
        String userFullName = "John Doe";
        return userFullName;
    }
    private static int getUserAge(int userID) {
        System.out.println("Age");
        int age = 30;
        return age;
    }
}