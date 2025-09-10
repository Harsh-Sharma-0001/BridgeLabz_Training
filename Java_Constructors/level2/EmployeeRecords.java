// EmployeeRecords.java

// Base class
class Employee {
    public int employeeID;        // public → accessible everywhere
    protected String department;  // protected → accessible in subclasses
    private double salary;        // private → only inside this class

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to set salary
    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
            System.out.println("Salary updated to: " + salary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------------");
    }
}

// Subclass
class Manager extends Employee {
    private String teamName;

    Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    // Demonstrating access to employeeID (public) and department (protected)
    public void showManagerDetails() {
        System.out.println("Manager ID: " + employeeID);     // public → accessible
        System.out.println("Manager Department: " + department); // protected → accessible
        System.out.println("Team Name: " + teamName);
        System.out.println("----------------------------");
    }
}

// Main class
public class EmployeeRecords {
    public static void main(String[] args) {
        // Create Employee object
        Employee emp1 = new Employee(101, "HR", 40000);
        emp1.displayEmployeeDetails();

        // Modify salary
        emp1.setSalary(45000);
        System.out.println("Updated Salary: " + emp1.getSalary());
        System.out.println();

        // Create Manager object
        Manager mgr1 = new Manager(202, "IT", 70000, "Tech Team");
        mgr1.showManagerDetails();
        mgr1.setSalary(80000);
        System.out.println("Manager's New Salary: " + mgr1.getSalary());
    }
}
