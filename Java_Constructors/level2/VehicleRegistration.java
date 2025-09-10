// VehicleRegistration.java

class Vehicle {
    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable (shared among all vehicles)
    static double registrationFee = 5000.0;  // Default registration fee

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display details
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
        System.out.println("---------------------------");
    }

    // Class method to update registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

// Main class
public class VehicleRegistration {
    public static void main(String[] args) {
        // Create vehicle objects
        Vehicle v1 = new Vehicle("Pragati", "Car");
        Vehicle v2 = new Vehicle("Aman", "Bike");

        // Display initial details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee
        Vehicle.updateRegistrationFee(7000.0);

        // Display details after updating fee
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
