package String.Level3;
import java.util.Scanner;

public class CharFrequencyNestedLoop {

    // Method to find frequency using nested loops
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue; // already counted
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        // Store results in String array
        String[] result = new String[chars.length];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " -> " + freq[i];
            }
        }
        return java.util.Arrays.copyOf(result, index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] res = findFrequency(text);
        System.out.println("Character Frequencies:");
        for (String s : res) {
            System.out.println(s);
        }
    }
}
