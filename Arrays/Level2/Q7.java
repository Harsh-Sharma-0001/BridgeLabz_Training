package Arrays.Level2;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");

            double weight;
            do {
                System.out.print("Enter weight in kg: ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            } while (weight <= 0);

            double height;
            do {
                System.out.print("Enter height in meters: ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive. Please enter again.");
                }
            } while (height <= 0);

            personData[i][0] = weight;
            personData[i][1] = height;

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nPerson Details:");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(m)", "BMI", "Status");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
