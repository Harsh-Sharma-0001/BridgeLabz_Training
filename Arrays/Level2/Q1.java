package Arrays.Level2;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMP_COUNT = 10;
        double[] salary = new double[EMP_COUNT];
        double[] yearsOfService = new double[EMP_COUNT];
        double[] bonus = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        System.out.println("Enter salary and years of service for " + EMP_COUNT + " employees:");

        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("Employee " + (i + 1) + ":");

            System.out.print("  Enter Salary: ");
            double sal = sc.nextDouble();
            if (sal <= 0) {
                System.out.println("  Invalid salary! Please enter again.");
                i--; 
                continue;
            }

            System.out.print("  Enter Years of Service: ");
            double yrs = sc.nextDouble();
            if (yrs < 0) {
                System.out.println("  Invalid years of service! Please enter again.");
                i--; 
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = yrs;
        }

        for (int i = 0; i < EMP_COUNT; i++) {
            double rate = (yearsOfService[i] > 5) ? 0.05 : 0.02;

            bonus[i] = salary[i] * rate;
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
        sc.close();

    }
}
