package DayThree;

public class DayThree {

    public static void main(String[] args) {
    String hello = getGreeting();
    int length = hello.length();
        System.out.println(hello);
    }
    private static String getGreeting(){
        return "Hello World!";
    }
}