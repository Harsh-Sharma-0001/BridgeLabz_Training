// HotelBooking.java
class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    double ratePerNight;

    // Default constructor
    HotelBooking() {
        this("Unknown", "Standard", 0);  // constructor chaining
    }

    // Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;

        // Assign rate based on room type
        if (roomType.equalsIgnoreCase("Deluxe")) {
            this.ratePerNight = 3000.0;
        } else if (roomType.equalsIgnoreCase("Suite")) {
            this.ratePerNight = 5000.0;
        } else {
            this.ratePerNight = 2000.0; // Standard
        }
    }

    // Copy constructor
    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
        this.ratePerNight = other.ratePerNight;
    }

    // Calculate total cost
    double calculateTotalCost() {
        return nights * ratePerNight;
    }

    // Display booking details
    void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("Rate per Night: ₹" + ratePerNight);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
        System.out.println("---------------------------");
    }
}

// Main class
public class HotelBookingSystem {
    public static void main(String[] args) {
        // Default booking
        HotelBooking b1 = new HotelBooking();

        // Parameterized booking
        HotelBooking b2 = new HotelBooking("Pragati", "Deluxe", 3);

        // Copy booking (duplicate of b2)
        HotelBooking b3 = new HotelBooking(b2);

        b1.display();
        b2.display();
        b3.display();
    }
}
