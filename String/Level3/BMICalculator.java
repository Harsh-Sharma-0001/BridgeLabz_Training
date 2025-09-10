package String.Level3;
import java.util.Scanner;

public class BMICalculator {

    // Method to compute BMI and Status
    public static String[] getBMIStatus(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // convert cm to m
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 24.9) status = "Normal";
        else if (bmi < 29.9) status = "Overweight";
        else status = "Obese";
        return new String[]{String.valueOf(bmi), status};
    }

    // Method to prepare result array
    public static String[][] calculateBMI(double[][] hw) {
        String[][] result = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            result[i][0] = String.valueOf(hw[i][0]); // weight
            result[i][1] = String.valueOf(hw[i][1]); // height
            String[] bmiData = getBMIStatus(hw[i][0], hw[i][1]);
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }
        return result;
    }

    // Display method
    public static void display(String[][] result) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight", "Height", "BMI", "Status");
        for (String[] row : result) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) for person " + (i + 1) + ": ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) for person " + (i + 1) + ": ");
            hw[i][1] = sc.nextDouble();
        }

        String[][] result = calculateBMI(hw);
        display(result);
    }
}
