import java.util.Scanner;

class Q06_CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
        input.close();
    }
}
