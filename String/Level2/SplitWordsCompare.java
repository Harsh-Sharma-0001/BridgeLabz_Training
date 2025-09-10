package String.Level2;
import java.util.*;

public class SplitWordsCompare {

    public static String[] customSplit(String text) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                word.append(c);
            } else {
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0);
                }
            }
        }
        if (word.length() > 0) words.add(word.toString());
        return words.toArray(new String[0]);
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] custom = customSplit(text);
        String[] builtin = text.split(" ");

        System.out.println("Custom Split: " + Arrays.toString(custom));
        System.out.println("Built-in Split: " + Arrays.toString(builtin));
        System.out.println("Are both same? " + compareArrays(custom, builtin));
    }
}
