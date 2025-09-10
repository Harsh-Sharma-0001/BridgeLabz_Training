 
import java.util.*;

class Circle {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();

        // Creating object
        Circle c = new Circle(r);

        // Displaying results
        System.out.println("\n--- Circle Details ---");
        c.displayDetails();

        sc.close();
    }
}