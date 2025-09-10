import java.util.Scanner;

class Q08_Countdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();
        while (counter > 0) {
            System.out.println(counter);
            counter--;
        }
        input.close();
    }
}
