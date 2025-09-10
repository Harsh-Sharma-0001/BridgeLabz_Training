// ProductInventory.java

class Product {
    // Instance variables
    String productName;
    double price;

    // Class variable (shared among all objects)
    static int totalProducts = 0;

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increase count whenever a new product is created
    }

    // Instance method to display product details
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
        System.out.println("-------------------------");
    }

    // Class method to display total number of products
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

// Main class
public class ProductInventory {
    public static void main(String[] args) {
        // Create product objects
        Product p1 = new Product("Laptop", 55000.0);
        Product p2 = new Product("Smartphone", 25000.0);
        Product p3 = new Product("Headphones", 2000.0);

        // Display each product details
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        // Display total number of products created
        Product.displayTotalProducts();
    }
}
