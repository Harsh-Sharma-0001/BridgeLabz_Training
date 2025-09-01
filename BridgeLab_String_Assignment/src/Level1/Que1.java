package Level1;
import java.util.Scanner;
public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		Boolean isEqual = true;
		
		if(str1.length() != str2.length()) {
			System.out.println("Not Equal");
		}
		
		else {
			for(int i=0;i<str1.length();i++) {
				if(str1.charAt(i) !=str2.charAt(i)) {
					isEqual = false;
					
					break;
				}
				else {
					isEqual = true;
					
				}
			}
		}
		if(isEqual == true) {
			System.out.println("Both are equal Strings");
		}
		else {
			System.out.println("Both are unequals");
		}

	}

}
