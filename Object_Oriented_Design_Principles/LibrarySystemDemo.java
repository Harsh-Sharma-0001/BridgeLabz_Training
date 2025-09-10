import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBookInfo() {
        System.out.println("Book: " + title + " by " + author);
    }
}

class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            book.displayBookInfo();
        }
    }
}

public class LibrarySystemDemo {
    public static void main(String[] args) {
      
        Book b1 = new Book("Java Basics", "John Doe");
        Book b2 = new Book("OOP in Depth", "Jane Smith");

        Library cityLibrary = new Library("City Library");
        Library collegeLibrary = new Library("College Library");

        cityLibrary.addBook(b1);
        cityLibrary.addBook(b2);

        collegeLibrary.addBook(b2); 

        cityLibrary.showBooks();
        System.out.println();
        collegeLibrary.showBooks();
    }
}
