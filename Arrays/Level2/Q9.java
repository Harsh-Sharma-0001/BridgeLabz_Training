package Arrays.Level2;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + " in Physics, Chemistry, Maths:");
            for (int j = 0; j < 3; j++) {
                int mark;
                while (true) {
                    mark = sc.nextInt();
                    if (mark >= 0 && mark <= 100) {
                        marks[i][j] = mark;
                        break;
                    } else {
                        System.out.print("Invalid mark! Enter a positive value between 0 and 100: ");
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 75) {
                grade[i] = 'B';
            } else if (percentage[i] >= 50) {
                grade[i] = 'C';
            } else if (percentage[i] >= 35) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        System.out.println("\nStudent Results:");
        System.out.println("--------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(marks[i][j] + "\t\t");
            }
            System.out.printf("%.2f\t\t%c\n", percentage[i], grade[i]);
        }

        sc.close();
    }
}
