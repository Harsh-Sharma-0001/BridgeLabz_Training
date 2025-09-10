// UniversityManagement.java

// Base class
class Student {
    public int rollNumber;      // public → accessible everywhere
    protected String name;      // protected → accessible in subclasses
    private double CGPA;        // private → only accessible within this class

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Setter for CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA value!");
        }
    }

    // Display method
    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
        System.out.println("---------------------------");
    }
}

// Subclass
class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);  // call parent constructor
        this.specialization = specialization;
    }

    // Demonstrating access to protected member 'name'
    public void showSpecialization() {
        System.out.println("Postgraduate Student: " + name + " (Specialization: " + specialization + ")");
    }
}

// Main class
public class UniversityManagement {
    public static void main(String[] args) {
        // Create Student
        Student s1 = new Student(101, "Pragati", 8.5);
        s1.display();

        // Modify CGPA using setter
        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());
        System.out.println();

        // Create PostgraduateStudent
        PostgraduateStudent pg = new PostgraduateStudent(201, "Aman", 9.2, "Computer Science");
        pg.display();
        pg.showSpecialization();
    }
}
