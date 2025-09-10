package String.Level2;
import java.util.*;

public class ShortestLongestWord {

    public static String[] customSplit(String text) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') word.append(c);
            else if (word.length() > 0) {
                words.add(word.toString());
                word.setLength(0);
            }
        }
        if (word.length() > 0) words.add(word.toString());
        return words.toArray(new String[0]);
    }

    public static int getLength(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void findShortestAndLongest(String[] words) {
        String shortest = words[0], longest = words[0];

        for (String word : words) {
            if (getLength(word) < getLength(shortest)) shortest = word;
            if (getLength(word) > getLength(longest)) longest = word;
        }

        System.out.println("Shortest Word: " + shortest);
        System.out.println("Longest Word: " + longest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        findShortestAndLongest(words);
    }
}
