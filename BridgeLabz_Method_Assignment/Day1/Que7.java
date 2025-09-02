import java.util.Scanner;
public class Que7 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length");
    int length = sc.nextInt();
    System.out.println("Enter the width");
    int width = sc.nextInt();

    int parameter = 2 *(length + width);
    System.out.println("parameter of rectangle is : " + parameter);
    }
}
