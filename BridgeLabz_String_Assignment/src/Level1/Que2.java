package Level1;
import java.util.Scanner;
public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
	}
	
	public static char[] getChars(String s) {
	    char[] chars = new char[s.length()];      // create array of same size
	    for (int i = 0; i < s.length(); i++) {
	        chars[i] = s.charAt(i);          
	    }
	    return chars;                       
	}


}
