package arrays;
import java.util.*;
public class Que4 {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double[] numbers = new double[10];
	        double total = 0.0;
	        int index = 0;

	        while (true) {
	            System.out.print("Enter a number: ");
	            double num = sc.nextDouble();

	            if (num <= 0) {
	                break;
	            }

	            if (index == 10) {
	                System.out.println("Array limit reached (10 numbers).");
	                break;
	            }

	            numbers[index] = num;
	            index++;
	        }

	        System.out.println("\nYou entered:");
	        for (int i = 0; i < index; i++) {
	            System.out.print(numbers[i] + " ");
	            total += numbers[i];
	        }

	        System.out.println("\nSum of numbers = " + total);
	    }
	

}
