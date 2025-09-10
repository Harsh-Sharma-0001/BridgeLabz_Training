package String.Level2;
import java.util.Scanner;

public class StringLengthWithoutMethod {
    
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // will throw exception when index goes out of bound
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        int customLength = getLength(text);
        int builtInLength = text.length();

        System.out.println("Custom Length = " + customLength);
        System.out.println("Built-in Length = " + builtInLength);
    }
}
