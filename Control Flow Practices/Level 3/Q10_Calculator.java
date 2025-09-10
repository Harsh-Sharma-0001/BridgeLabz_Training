import java.util.Scanner;

class Q10_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double first = input.nextDouble();
        double second = input.nextDouble();
        String op = input.next();
        switch (op) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                System.out.println(first / second);
                break;
            default:
                System.out.println("Invalid Operator");
        }
        input.close();
    }
}
