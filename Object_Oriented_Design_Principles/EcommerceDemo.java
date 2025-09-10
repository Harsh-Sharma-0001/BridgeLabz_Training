import java.util.*;

class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("  Product: " + name);
    }
}

class Order {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showOrder() {
        System.out.println("Order Details:");
        for (Product p : products) {
            p.display();
        }
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        System.out.println("Customer " + name + " placed an order:");
        order.showOrder();
    }
}

public class EcommerceDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop");
        Product p2 = new Product("Mouse");

        Order order = new Order();
        order.addProduct(p1);
        order.addProduct(p2);

        Customer c = new Customer("John");
        c.placeOrder(order);
    }
}
