import java.util.Scanner;

class Q10_GreatestFactorUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int greatestFactor = 1;
        int i = number - 1;
        while (i >= 1) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
            i--;
        }
        System.out.println("Greatest factor: " + greatestFactor);
        input.close();
    }
}
