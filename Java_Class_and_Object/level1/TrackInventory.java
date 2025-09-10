 

import java.util.*;

class Item {
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Method to calculate total cost for given quantity
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class TrackInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Item Code: ");
        int code = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        // Creating object
        Item item = new Item(code, name, price);

        // Displaying item details
        System.out.println("\n--- Item Details ---");
        item.displayDetails();

        // Displaying total cost
        double total = item.calculateTotalCost(qty);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Cost: " + total);

        sc.close();
    }
}