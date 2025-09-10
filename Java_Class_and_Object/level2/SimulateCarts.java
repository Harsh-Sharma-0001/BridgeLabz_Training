
import java.util.ArrayList;
import java.util.Iterator;

class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return itemName + " - Price: $" + price + ", Quantity: " + quantity;
    }
}

class ShoppingCart {
    private ArrayList<CartItem> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    // Add item to cart (if item exists, update quantity)
    public void addItem(CartItem newItem) {
        for (CartItem item : cartItems) {
            if (item.itemName.equalsIgnoreCase(newItem.itemName)) {
                item.quantity += newItem.quantity;
                System.out.println(newItem.itemName + " quantity updated.");
                return;
            }
        }
        cartItems.add(newItem);
        System.out.println(newItem.itemName + " added to cart.");
    }

    // Remove item from cart by itemName
    public void removeItem(String itemName) {
        Iterator<CartItem> iterator = cartItems.iterator();
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.itemName.equalsIgnoreCase(itemName)) {
                iterator.remove();
                System.out.println(itemName + " removed from cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in cart.");
    }

    // Calculate total cost
    public double getTotalCost() {
        double total = 0;
        for (CartItem item : cartItems) {
            total += item.getTotalPrice();
        }
        return total;
    }

    // Display all items in cart
    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("Items in Cart:");
        for (CartItem item : cartItems) {
            System.out.println(item);
        }
        System.out.printf("Total Cost: $%.2f\n", getTotalCost());
    }
}

public class SimulateCarts {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add items
        cart.addItem(new CartItem("Apple", 0.99, 5));
        cart.addItem(new CartItem("Banana", 0.59, 3));
        cart.addItem(new CartItem("Milk", 1.49, 2));

        cart.displayCart();

        // Remove an item
        cart.removeItem("Banana");

        cart.displayCart();
    }
}
