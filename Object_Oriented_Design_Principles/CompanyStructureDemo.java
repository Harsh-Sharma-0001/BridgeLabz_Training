import java.util.*;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("  Employee: " + name);
    }
}

class Department {
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    public void display() {
        System.out.println(" Department: " + name);
        for (Employee e : employees) {
            e.display();
        }
    }
}

class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void showStructure() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.display();
        }
    }

    public void deleteCompany() {
        departments.clear(); // composition: delete all departments and their employees
        System.out.println("Company and its departments are deleted.");
    }
}

public class CompanyStructureDemo {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department dev = new Department("Development");
        dev.addEmployee("Alice");
        dev.addEmployee("Bob");

        Department hr = new Department("HR");
        hr.addEmployee("Carol");

        company.addDepartment(dev);
        company.addDepartment(hr);

        company.showStructure();

        // Delete the company
        company.deleteCompany();
    }
}
