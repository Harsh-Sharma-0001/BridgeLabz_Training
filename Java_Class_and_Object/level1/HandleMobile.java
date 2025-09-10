class MobilePhone {
    String brand;
    String model;
    double price;

    // Constructor
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class HandleMobile {
    public static void main(String[] args) {
        // Creating objects of MobilePhone
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 15", 79999);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S23", 69999);
        MobilePhone phone3 = new MobilePhone("OnePlus", "11R", 39999);

        System.out.println("--- Phone 1 ---");
        phone1.displayDetails();

        System.out.println("\n--- Phone 2 ---");
        phone2.displayDetails();

        System.out.println("\n--- Phone 3 ---");
        phone3.displayDetails();
    }
}

