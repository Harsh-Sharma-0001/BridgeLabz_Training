import java.util.Scanner;

class question_handshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        int handshakes = (n * (n - 1)) / 2;
        System.out.println("The maximum number of possible handshakes is " + handshakes);
    }
}