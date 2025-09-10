package String.Level3;
import java.util.Scanner;

public class UniqueCharacters {

    // Method to find length without length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Method to find unique characters
    public static char[] uniqueChars(String str) {
        int len = getLength(str);
        char[] result = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result[index++] = ch;
            }
        }

        // Copy only unique part
        char[] finalResult = new char[index];
        for (int i = 0; i < index; i++) finalResult[i] = result[i];
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] unique = uniqueChars(text);
        System.out.print("Unique Characters: ");
        for (char c : unique) System.out.print(c + " ");
    }
}
