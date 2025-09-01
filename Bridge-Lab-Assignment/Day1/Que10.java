import java.util.Scanner;
public class Que10 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the distance in km");
    float kilometer = sc.nextFloat();

    double miles = kilometer * 0.621371;

    System.out.println("Answer in miles is : " +  miles);
    }
}
