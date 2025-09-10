package Arrays.Level2;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        if (number < 0) {
            number = -number;
        }

        int[] freq = new int[10];

        if (number == 0) {
            freq[0] = 1;
        } else {
            while (number > 0) {
                int digit = (int)(number % 10); 
                freq[digit]++;                
                number /= 10;                  
            }
        }

        System.out.println("\nFrequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " time(s)");
            }
        }

        sc.close();
    }
}
