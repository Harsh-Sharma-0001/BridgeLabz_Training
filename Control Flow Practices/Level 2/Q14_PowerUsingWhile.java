import java.util.Scanner;

class Q14_PowerUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();
        if (power > 0) {
            int result = 1;
            int counter = 0;
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println("Result: " + result);
        }
        input.close();
    }
}
