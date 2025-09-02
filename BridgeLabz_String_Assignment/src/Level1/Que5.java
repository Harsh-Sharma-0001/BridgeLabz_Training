package Level1;
import java.util.*;
public class Que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		char[] arr = s.toCharArray();
		int count =0;
		
		for(char c : arr) {
			count++;
		}
		System.out.println(count);
	}

}
