package String.Level3;
import java.util.Scanner;

public class FirstNonRepeatingChar {

    public static char firstNonRepeating(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '-'; // if not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        char result = firstNonRepeating(text);
        if (result == '-') System.out.println("No non-repeating character.");
        else System.out.println("First non-repeating character: " + result);
    }
}
