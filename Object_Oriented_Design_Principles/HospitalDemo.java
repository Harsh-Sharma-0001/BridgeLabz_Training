import java.util.*;

class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting with patient " + patient.getName());
        patient.addDoctor(this);
    }

    public String getName() {
        return name;
    }
}

class Patient {
    private String name;
    private List<Doctor> consultedDoctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor doctor) {
        consultedDoctors.add(doctor);
    }

    public String getName() {
        return name;
    }

    public void showDoctors() {
        System.out.println("Patient " + name + " has consulted:");
        for (Doctor d : consultedDoctors) {
            System.out.println(" - Dr. " + d.getName());
        }
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Alice");
        Doctor d2 = new Doctor("Bob");

        Patient p1 = new Patient("Charlie");
        Patient p2 = new Patient("Daisy");

        d1.consult(p1);
        d2.consult(p1);
        d2.consult(p2);

        p1.showDoctors();
        p2.showDoctors();
    }
}
