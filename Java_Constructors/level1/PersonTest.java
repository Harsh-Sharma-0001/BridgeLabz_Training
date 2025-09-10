// Person.java
class Person {
    String name;
    int age;

    // Default constructor
    Person() {
        this("Unknown", 0);  // constructor chaining
    }

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Display person details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("---------------------");
    }
}

// Main class
public class PersonTest {
    public static void main(String[] args) {
        // Original person
        Person p1 = new Person("Pragati", 21);

        // Clone using copy constructor
        Person p2 = new Person(p1);

        // Display both
        p1.display();
        p2.display();
    }
}
