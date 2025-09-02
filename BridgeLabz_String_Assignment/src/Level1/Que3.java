package Level1;
import java.util.Scanner;
public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str  = sc.next();
		String str1="";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            str1 += ch;
        }
			
			
		
		System.out.println(str1);

	}

}
