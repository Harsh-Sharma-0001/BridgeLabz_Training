import java.util.Scanner;

public class Que3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temp. in Celcius");
        float celcius = sc.nextFloat();
        float Fahrenheit =(celcius * 9/5) + 32; 

        System.out.println("Temperature of room in Fahrenheit is : " + Fahrenheit);
    }
}