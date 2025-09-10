import java.util.Scanner;

public class Ques9 {
    public static boolean isPositive(int n) { return n > 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (isPositive(numbers[i])) {
                System.out.print("Positive and ");
                if (isEven(numbers[i])) System.out.println("Even");
                else System.out.println("Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int cmp = compare(numbers[0], numbers[4]);
        if (cmp == 0) System.out.println("First and Last numbers are Equal");
        else if (cmp == 1) System.out.println("First number is Greater than Last");
        else System.out.println("First number is Less than Last");
    }
}
