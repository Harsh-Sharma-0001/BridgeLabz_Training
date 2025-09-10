import java.util.Scanner;

class Q09_AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum += i;
        }
        System.out.println(sum > number ? "Abundant Number" : "Not an Abundant Number");
        input.close();
    }
}
