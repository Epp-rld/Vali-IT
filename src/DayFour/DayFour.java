package DayFour;

public class DayFour {

    public static void main(String[] args) {
        int [] firstArray = new int[5];
        // {0, 0, 0, 0, 0}
        firstArray[3]++;
        // Neljandat elementi (seda tähistab [3]) kasvatame ++-ga ühe võrra (ehk 0 --> 1):
        // {0, 0, 0, 1, 0}
        System.out.println(firstArray[3]);
        // Süsteem prindib välja neljanda elemendi väärtuse 1.



    }
}
