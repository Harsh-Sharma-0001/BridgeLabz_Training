// Book.java
class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("---------------------");
    }
}

// Main class
public class BookClass {
    public static void main(String[] args) {
        // Using default constructor
        Book b1 = new Book();

        // Using parameterized constructor
        Book b2 = new Book("Java Programming", "James Gosling", 499.99);

        // Display details
        b1.display();
        b2.display();
    }
}
