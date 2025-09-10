// CarRental.java
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 1000.0;  // fixed rate per day

    // Default constructor
    CarRental() {
        this("Unknown", "Not Assigned", 0);  // constructor chaining
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Display rental details
    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
        System.out.println("-------------------------");
    }
}

// Main class
public class CarRentalSystem {
    public static void main(String[] args) {
        // Default constructor
        CarRental rental1 = new CarRental();

        // Parameterized constructor
        CarRental rental2 = new CarRental("Pragati", "Hyundai i20", 5);

        rental1.display();
        rental2.display();
    }
}
