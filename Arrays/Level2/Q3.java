
package Arrays.Level2;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;                  
        int[] digits = new int[maxDigit];   
        int index = 0;                      
        while (number != 0) {
            int digit = number % 10;       
            digits[index] = digit;       
            index++;                       
            if (index == maxDigit) {
                break;
            }
            number = number / 10;           
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int current = digits[i];

            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current != largest) {
                secondLargest = current;
            }
        }

        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit does not exist (all digits same or only one digit).");
        }

        sc.close();
    }
}
