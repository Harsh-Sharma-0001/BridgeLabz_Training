import java.util.Scanner;

class Q01_DivisibleBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5");
        } else {
            System.out.println(number + " is not divisible by 5");
        }
        input.close();
    }
}
