import java.util.Scanner;

class Q08_HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println(number + (number % sum == 0 ? " is a Harshad number" : " is not a Harshad number"));
        input.close();
    }
}
