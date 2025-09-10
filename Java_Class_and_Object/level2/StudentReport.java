// Student class with attributes and methods
class Student {
    String name;
    int rollNumber;
    int marks;

    // Constructor to initialize student object
    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student's details and grade
    public void displayReport() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("---------------------------");
    }
}

// Main class to test the Student class
public class StudentReport {

    public static void main(String[] args) {
        // Create Student objects
        Student s1 = new Student("Ali", 101, 85);
        Student s2 = new Student("Sara", 102, 72);
        Student s3 = new Student("Hamid", 103, 48);

        // Display their reports
        s1.displayReport();
        s2.displayReport();
        s3.displayReport();
    }
}