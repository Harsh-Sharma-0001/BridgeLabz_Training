package String.Level1;
import java.util.Scanner;

public class StringToCharArray {
    // Custom method to convert string to char array
    public static char[] customToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    // Compare two char arrays
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] customArr = customToCharArray(text);
        char[] builtInArr = text.toCharArray();

        System.out.println("Arrays are equal? " + compareArrays(customArr, builtInArr));
    }
}
