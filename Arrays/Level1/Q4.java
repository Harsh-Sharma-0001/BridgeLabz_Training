package Arrays.Level1;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];  
        double total = 0.0;                 
        int index = 0;                      

        System.out.println("Enter up to 10 numbers ");

        while (true) {
            System.out.print("Enter number "+(index+1)+" :");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }
            if (index== 10) {
                System.out.println("Maximum of 10 numbers reached!");
                break;
            }

            numbers[index] = num;
            index++;
        }

        System.out.println("\nNumbers you entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("\nSum of numbers: " + total);

        sc.close();
    }
}
