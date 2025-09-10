import java.util.*;

class CourseUMS {
    private String name;
    private Professor professor;
    private List<StudentUMS> students = new ArrayList<>();

    public CourseUMS(String name) {
        this.name = name;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(StudentUMS student) {
        students.add(student);
    }

    public void showDetails() {
        System.out.println("Course: " + name);
        if (professor != null) {
            System.out.println(" Taught by: " + professor.getName());
        } else {
            System.out.println(" No professor assigned yet.");
        }

        System.out.println(" Enrolled Students:");
        if (students.isEmpty()) {
            System.out.println("  No students enrolled.");
        } else {
            for (StudentUMS s : students) {
                System.out.println("  - " + s.getName());
            }
        }
    }

    public String getName() {
        return name;
    }
}

class StudentUMS {
    private String name;
    private List<CourseUMS> courses = new ArrayList<>();

    public StudentUMS(String name) {
        this.name = name;
    }

    public void enrollCourse(CourseUMS course) {
        courses.add(course);
        course.addStudent(this);
    }

    public String getName() {
        return name;
    }

    public void showCourses() {
        System.out.println("Student: " + name + " is enrolled in:");
        for (CourseUMS c : courses) {
            System.out.println(" - " + c.getName());
        }
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public void assignToCourse(CourseUMS course) {
        course.setProfessor(this);
    }

    public String getName() {
        return name;
    }
}

public class UniversityManagementDemo {
    public static void main(String[] args) {
        
        Professor prof1 = new Professor("Dr. Smith");
        Professor prof2 = new Professor("Prof. Johnson");

     
        CourseUMS c1 = new CourseUMS("Computer Science");
        CourseUMS c2 = new CourseUMS("Mathematics");

   
        prof1.assignToCourse(c1);
        prof2.assignToCourse(c2);

    
        StudentUMS s1 = new StudentUMS("Alice");
        StudentUMS s2 = new StudentUMS("Bob");

    
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c2);

   
        s1.showCourses();
        s2.showCourses();

        System.out.println();
        c1.showDetails();
        System.out.println();
        c2.showDetails();
    }
}
