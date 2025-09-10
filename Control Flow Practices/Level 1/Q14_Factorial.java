import java.util.Scanner;

class Q14_Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number >= 0) {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Not a positive integer.");
        }
        input.close();
    }
}