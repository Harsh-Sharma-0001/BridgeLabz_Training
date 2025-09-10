import java.util.*;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Faculty: " + name);
    }
}

class DepartmentU {
    private String name;

    public DepartmentU(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("  Department: " + name);
    }
}

class University {
    private String name;
    private List<DepartmentU> departments = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addDepartment(DepartmentU d) {
        departments.add(d);
    }

    public void addFaculty(Faculty f) {
        faculties.add(f);
    }

    public void displayStructure() {
        System.out.println("University: " + name);
        for (DepartmentU d : departments) {
            d.display();
        }
        for (Faculty f : faculties) {
            f.display();
        }
    }

    public void deleteUniversity() {
        departments.clear(); // Composition: deleted with University
        System.out.println("University and its departments are deleted.");
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        University uni = new University("Global University");

        DepartmentU d1 = new DepartmentU("Engineering");
        DepartmentU d2 = new DepartmentU("Arts");

        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Prof. Alice");

        uni.addDepartment(d1);
        uni.addDepartment(d2);
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.displayStructure();

        uni.deleteUniversity();
    }
}
