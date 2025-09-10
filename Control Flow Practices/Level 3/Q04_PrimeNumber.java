import java.util.Scanner;

class Q04_PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean isPrime = true;
        if (number > 1) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(number + " is " + (isPrime ? "a prime number" : "not a prime number"));
        }
        input.close();
    }
}
