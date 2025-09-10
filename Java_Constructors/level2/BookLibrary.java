// BookLibrary.java

// Base class
class Book {
    public String ISBN;        // public → accessible everywhere
    protected String title;    // protected → accessible in subclasses
    private String author;     // private → accessible only inside this class

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Display details
    public void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("---------------------------");
    }
}

// Subclass
class EBook extends Book {
    String fileFormat;

    EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author); // call parent constructor
        this.fileFormat = fileFormat;
    }

    // Demonstrating access to ISBN (public) and title (protected)
    public void showEBookDetails() {
        System.out.println("E-Book ISBN: " + ISBN);       // public → accessible
        System.out.println("E-Book Title: " + title);     // protected → accessible in subclass
        System.out.println("File Format: " + fileFormat);
        System.out.println("---------------------------");
    }
}

// Main class
public class BookLibrary {
    public static void main(String[] args) {
        // Create Book object
        Book b1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        b1.display();

        // Change author using setter
        b1.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + b1.getAuthor());
        System.out.println();

        // Create EBook object
        EBook eb1 = new EBook("978-0134685991", "Effective Java", "Joshua Bloch", "PDF");
        eb1.showEBookDetails();
    }
}
