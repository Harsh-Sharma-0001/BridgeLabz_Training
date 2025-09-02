package Level1;

import java.util.Scanner;
import java.util.StringTokenizer;
public class Que7 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a sentence:");
	        String str = sc.nextLine();

	        // Break string into words using space as delimiter
	        StringTokenizer st = new StringTokenizer(str, " ");

	        // Count number of tokens (words)
	        int count = st.countTokens();

	        System.out.println("Number of words: " + count);
	    }
	
}
