package Arrays.Level1;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int maxFactor = 10;                         
        int[] factors = new int[maxFactor];         
        int index = 0;      

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {          
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index] = i;     
                index++;                           
            }
        }

        System.out.print("Factors of " + num + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

    }
}
