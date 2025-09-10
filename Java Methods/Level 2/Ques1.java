import java.util.Scanner;

public class Ques1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Getting factors
        int[] factors = getFactors(number);

        // Display factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calculations
        int sum = sumOfFactors(factors);
        int product = productOfFactors(factors);
        int sumOfSquares = sumOfSquaresOfFactors(factors);

        // Display results
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

        scanner.close();
    }

    // Method to get factors of a number
    public static int[] getFactors(int num) {
        int count = 0;

        // First loop to count the number of factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Initialize array with count
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors in array
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to calculate sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate product of factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate sum of squares of factors
    public static int sumOfSquaresOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2); // or: sum += factor * factor;
        }
        return sum;
    }
}
