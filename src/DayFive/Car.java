package DayFive;

public class Car {
    // Properties (fields) of the class.
    String brand;
    String model;
    int year;

    // Default constructor
    public Car() {
        // Initialise default values.
        brand = "Not specified";
        model = "Unknown";
        year = 2000;
    }
    // Parameterised constructor.
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
