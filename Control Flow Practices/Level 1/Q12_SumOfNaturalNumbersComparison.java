import java.util.Scanner;

class Q12_SumOfNaturalNumbersComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 0) {
            int formulaSum = number * (number + 1) / 2;
            int loopSum = 0;
            int count = 1;
            while (count <= number) {
                loopSum += count;
                count++;
            }
            System.out.println("Formula sum: " + formulaSum + ", Loop sum: " + loopSum);
            System.out.println(formulaSum == loopSum ? "Both sums are equal." : "Sums differ.");
        } else {
            System.out.println("Not a natural number.");
        }
        input.close();
    }
}