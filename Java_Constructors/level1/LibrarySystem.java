// Book.java
class Book {
    String title;
    String author;
    double price;
    boolean availability;

    // Default constructor
    Book() {
        this("Unknown", "Unknown", 0.0, true); // constructor chaining
    }

    // Parameterized constructor
    Book(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow a book
    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("✅ You have successfully borrowed: " + title);
        } else {
            System.out.println("❌ Sorry, " + title + " is not available right now.");
        }
    }

    // Display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + (availability ? "Yes" : "No"));
        System.out.println("---------------------------");
    }
}

// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        // Create books
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 399.0, true);
        Book b2 = new Book("Java Programming", "James Gosling", 499.0, true);

        // Display books
        b1.display();
        b2.display();

        // Borrow a book
        b1.borrowBook();
        b1.borrowBook(); // Trying again to test availability

        // Show details after borrowing
        b1.display();
    }
}
