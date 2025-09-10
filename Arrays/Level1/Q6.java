package Arrays.Level1;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] heights = new double[11];
        double sum = 0.0;
        
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < 11; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i]; 
        }
        
        double mean = sum / 11;
        
        System.out.printf("mean height: %.2f\n", mean);
        
        sc.close();
    }
}
