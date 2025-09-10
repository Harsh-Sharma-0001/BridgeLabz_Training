package String.Level3;
import java.util.Scanner;

public class CharFrequency {

    public static String[][] findFrequency(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        String[][] result = new String[str.length()][2];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0; // reset after storing
                index++;
            }
        }

        // Trim the result array
        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) finalResult[i] = result[i];
        return finalResult;
    }

    public static void display(String[][] freqArr) {
        System.out.printf("%-10s %-10s\n", "Char", "Frequency");
        for (String[] row : freqArr) {
            System.out.printf("%-10s %-10s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] freqArr = findFrequency(text);
        display(freqArr);
    }
}
