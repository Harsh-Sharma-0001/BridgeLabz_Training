import java.util.Scanner;

class Q05_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }
        System.out.println(
                originalNumber + " is " + (sum == originalNumber ? "an Armstrong number" : "not an Armstrong number"));
        input.close();
    }
}
