// CourseManagement.java

class Course {
    // Instance variables
    String courseName;
    int duration;   // in weeks
    double fee;

    // Class variable (shared among all courses)
    static String instituteName = "Default Institute";

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: ₹" + fee);
        System.out.println("-------------------------");
    }

    // Class method to update institute name
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

// Main class
public class CourseManagement {
    public static void main(String[] args) {
        // Create some course objects
        Course c1 = new Course("Java Programming", 8, 5000.0);
        Course c2 = new Course("Web Development", 12, 7000.0);

        // Display details before changing institute name
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name (affects all courses)
        Course.updateInstituteName("Tech Academy");

        // Display details after updating institute name
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
