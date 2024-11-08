package DayFive.Object.DayFive;

/* exercise: create a book class. Create a class named Book with the following properties:
   title (String), author (String), yearPublished (int).
   The class should have:
   1. A default constructor that sets the properties to default values:
   title = "Unknown", author = "Unknown", yearPublished = 1900.
   2. A parameterised constructor that initialises the properties with values passed in.
   3. Write a main method to create objects using both constructors and print out the properties.
    */
public class Book {
    // Declare properties.
    String title;
    String author;
    int yearPublished;

    // Default constructor that sets the properties to default values.
    public Book() {
        title = "Unknown";
        author = "Unknown";
        yearPublished = 1900;
    }

    // Parameterized constructor that initialises the properties with values passed in.
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                '}';
    }
}

