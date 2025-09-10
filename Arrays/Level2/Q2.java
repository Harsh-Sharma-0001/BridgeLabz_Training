package Arrays.Level2;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();

            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            height[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
        }

        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nThe youngest friend is: " + names[youngestIndex] + " (Age: " + age[youngestIndex] + ")");
        System.out.println("The tallest friend is: " + names[tallestIndex] + " (Height: " + height[tallestIndex] + " cm)");

        sc.close();
    }
}
