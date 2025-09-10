package Arrays.Level1;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("even " + num );
                } else {
                    System.out.println("odd " + num );
                }
            } else if (num < 0) {
                System.out.println("negative " + num);
            } else {
                System.out.println("zero " + num );
            }
        }

        System.out.println("\n--- First and Last Element Comparison ---");
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("equal");
        } else if (first > last) {
            System.out.println( first +" is greater than " + last );
        } else {
            
            System.out.println( first +" is lesser than " + last );
        }

        sc.close();
    }
}
