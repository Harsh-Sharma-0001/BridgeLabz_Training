import java.util.Scanner;
public class Que4{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius");
    float radius = sc.nextFloat();
    double area  = 3.14 * radius*radius;

    System.out.println("Area of circle is :" + area);

    }
}