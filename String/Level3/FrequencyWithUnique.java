package String.Level3;
import java.util.Scanner;

public class FrequencyWithUnique {

    // Method to find length of string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);  // Will throw exception when index > last index
                count++;
            }
        } catch (Exception e) {
            // Exception stops loop
        }
        return count;
    }

    // Method to find unique characters using nested loops
    public static char[] uniqueCharacters(String str) {
        int len = findLength(str);
        char[] temp = new char[len]; // store possible uniques
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[uniqueCount++] = c;
            }
        }

        // Copy only uniqueCount elements into new array
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    // Method to find frequency of characters using unique characters
    public static String[][] findFrequency(String str) {
        int len = findLength(str);
        int[] freq = new int[256]; // ASCII

        // Count frequency
        for (int i = 0; i < len; i++) {
            freq[str.charAt(i)]++;
        }

        // Get unique characters
        char[] unique = uniqueCharacters(str);

        // Store unique char + frequency in 2D String array
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    // Display 2D String array
    public static void display(String[][] arr) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("    " + arr[i][0] + "      |     " + arr[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        display(result);
    }
}
