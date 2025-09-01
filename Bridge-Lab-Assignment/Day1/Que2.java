import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Take number 1");
        int num1 = sc.nextInt();

        System.out.println("Take number 2");
        int num2 = sc.nextInt();

        System.out.println("Sum is : " + (num1 + num2));

        sc.close(); // Scanner close karna achha practice hai
    }
}
