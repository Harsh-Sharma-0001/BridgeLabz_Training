import java.util.*;

class Course {
    private String name;
    private List<Student> enrolledStudents = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + name);
        for (Student s : enrolledStudents) {
            System.out.println(" - " + s.getName());
        }
    }

    public String getName() {
        return name;
    }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println(" - " + c.getName());
        }
    }

    public String getName() {
        return name;
    }
}

class School {
    private String name;
    private List<Student> students = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("School: " + name);
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}

public class SchoolSystemDemo {
    public static void main(String[] args) {
        School school = new School("Springfield High");

        Student s1 = new Student("John");
        Student s2 = new Student("Emma");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s1.enrollInCourse(c1);
        s1.enrollInCourse(c2);
        s2.enrollInCourse(c1);

        school.addStudent(s1);
        school.addStudent(s2);

        school.showStudents();

        s1.viewCourses();
        s2.viewCourses();

        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
    }
}
