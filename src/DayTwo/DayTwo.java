package DayTwo;

public class DayTwo {

    public static void main(String[] args) {

        String incomingText = "Aadress Tallinn, kesklinn";
        StringBuilder sb = new StringBuilder(incomingText);
        sb.append(", tänav");

    String string = sb.toString();
        System.out.println(string);
    }
}