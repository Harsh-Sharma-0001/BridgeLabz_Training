
import java.util.Scanner;

public class Ques10 {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][3];
        String[] statuses = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) of person " + (i + 1) + ": ");
            persons[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) of person " + (i + 1) + ": ");
            persons[i][1] = sc.nextDouble();

            persons[i][2] = calculateBMI(persons[i][0], persons[i][1]);
            statuses[i] = bmiStatus(persons[i][2]);
        }

        System.out.println("\nPerson\tWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.1f\t%.1f\t%.2f\t%s\n", (i+1), persons[i][0], persons[i][1], persons[i][2], statuses[i]);
        }
    }
}
