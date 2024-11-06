package DayThree;

public class DayThree {

    public static void main(String[] args) {
        getArea(4,5);
    }
// TODO - loo uus meetod private static void getArea(), mis arvutab ristküliku pindala
// TODO - kutsu see main meetodist välja argumendi väärtustega 4 ja 5
// TODO - loo uus meetod nimetusega private static void checkArea()
// TODO - kutsu checkArea() meetod välja getArea() meetodist
// TODO - prindi konsooli "Area is bigger than 20", kui pindala suurus ületab 20 ...
//  TODO - ... ja "Area is smaller than 20", kui alla selle

    private static void getArea(int length, int width) {
        int area = length * width;
        System.out.println("The area of the rectangle is " + area);
        checkArea(area);
    }

    private static void checkArea(int area) {
        if (area > 20) {
            System.out.println("Area is bigger than 20.");
        } else {
            System.out.println("Area is smaller than 20.");
    }
}
}
