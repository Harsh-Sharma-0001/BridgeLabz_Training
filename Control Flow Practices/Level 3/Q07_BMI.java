import java.util.Scanner;

class Q07_BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        double height = input.nextDouble() / 100.0;
        double bmi = weight / (height * height);
        String status;
        if (bmi <= 18.4)
            status = "Underweight";
        else if (bmi <= 24.9)
            status = "Normal";
        else if (bmi <= 39.9)
            status = "Overweight";
        else
            status = "Obese";
        System.out.println("BMI: " + bmi + ", Status: " + status);
        input.close();
    }
}
