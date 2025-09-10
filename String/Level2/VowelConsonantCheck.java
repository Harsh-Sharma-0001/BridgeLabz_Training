package String.Level2;
import java.util.*;
import java.util.*;

class VowelConsonantCheck {
    
    // Method to check character type
    static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z') {  // Convert to lowercase if uppercase
            c = (char)(c + 32);
        }
        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                return "Vowel";
            else
                return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    // Method to process string into 2D array
    static String[][] findCharTypes(String text) {
        int n = text.length();
        String[][] result = new String[n][2];
        for (int i=0; i<n; i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = checkCharType(c);
        }
        return result;
    }

    // Display 2D array in table
    static void display(String[][] arr) {
        System.out.printf("%-10s%-15s\n","Character","Type");
        System.out.println("--------------------------");
        for (String[] row : arr) {
            System.out.printf("%-10s%-15s\n",row[0],row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] result = findCharTypes(input);
        display(result);
    }
}
