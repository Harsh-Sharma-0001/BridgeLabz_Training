import java.util.Scanner;

class Q15_FactorialUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number >= 0) {
            int factorial = 1;
            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Not a positive integer.");
        }
        input.close();
    }
}
