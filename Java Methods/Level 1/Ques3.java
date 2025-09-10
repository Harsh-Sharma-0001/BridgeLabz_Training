import java.util.Scanner;

public class Ques3 {
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; // 5 km in meters
        return (int) Math.ceil(distance / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1 of triangle: ");
        double a = sc.nextDouble();
        System.out.print("Enter side2 of triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter side3 of triangle: ");
        double c = sc.nextDouble();

        int rounds = calculateRounds(a, b, c);
        System.out.println("The athlete must complete " + rounds + " rounds.");
    }
}
