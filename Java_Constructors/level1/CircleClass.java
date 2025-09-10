// Circle.java
class Circle {
    double radius;

    // Default constructor (calls parameterized constructor with default value)
    Circle() {
        this(1.0); // constructor chaining
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Display details
    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
        System.out.println("---------------------");
    }
}

// Main class
public class CircleClass {
    public static void main(String[] args) {
        // Circle with default radius
        Circle c1 = new Circle();

        // Circle with user-provided radius
        Circle c2 = new Circle(5.5);

        c1.display();
        c2.display();
    }
}
