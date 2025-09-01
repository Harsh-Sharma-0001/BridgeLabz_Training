package Level1;
import java.util.*;
public class Que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int st = 0;
		int ed = s.length()-1;
		boolean yes = true;
		
		while(st<ed) {
			if(s.charAt(st)!=s.charAt(ed)) {
				yes = false;
			}
			
			st++;
			ed--;
		}
		if(yes == true) {
			System.out.println("Palindrome hai!");
		}
		else {
			System.out.println("Palindrome nhi hai !");
		}
		
	}

}
