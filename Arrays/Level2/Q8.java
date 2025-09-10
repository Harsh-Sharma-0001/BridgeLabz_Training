package Arrays.Level2;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];       
        double[] percentage = new double[n]; 
        char[] grade = new char[n];       

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + " marks: ");
                int mark = sc.nextInt();

                if (mark < 0) {
                    System.out.println("Marks cannot be negative. Enter again.");
                    j--; // retry same subject
                    continue;
                }

                marks[i][j] = mark;
            }
        }

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (total / 300.0) * 100;

            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 50)
                grade[i] = 'C';
            else if (percentage[i] >= 35)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }

        System.out.println("\n--- Student Results ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-12s %-8s%n",
                "Physics", "Chemistry", "Maths", "Total", "Percentage", "Grade");

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            System.out.printf("%-10d %-10d %-10d %-12d %-12.2f %-8c%n",
                    marks[i][0], marks[i][1], marks[i][2],
                    total, percentage[i], grade[i]);
        }

        sc.close();
    }
}
