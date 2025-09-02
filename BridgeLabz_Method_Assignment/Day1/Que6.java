import java.util.Scanner;
public class Que6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal");
        int Principal = sc.nextInt();
        System.out.println("Enter the time");
        int time = sc.nextInt();
        System.out.println("Enter the rate");
        float rate = sc.nextFloat();

        double simpleInterest = (Principal * rate * time) / 100;
        System.out.println("Simple Interest is " + simpleInterest);
    }
}
