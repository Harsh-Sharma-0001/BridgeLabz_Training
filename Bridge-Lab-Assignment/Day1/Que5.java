import java.util.Scanner;
public class Que5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius ");
        float radius  = sc.nextFloat();
        System.out.println("Enter the Height");
        float height = sc.nextFloat();

        double area = 3.14 * (radius*radius) * height;
        
        System.out.println("Area of Cylinder is :" + area);
    }
}