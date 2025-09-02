import java.util.Scanner;
public class Que8 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the base value");
    int base = sc.nextInt();
    System.out.println("Enter the exponential value");
    int exponential = sc.nextInt();

    double ans = Math.pow(base, exponential);

    System.out.println("power is :" + ans);
    }
}