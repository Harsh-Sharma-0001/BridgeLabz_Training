package Level1;

import java.util.Scanner;

public class Que8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str  = sc.next();
		String str1="";
		for(int i=0;i<str.length();i++) {
			int arc= str.charAt(i);

            str1 += arc+" ";
        }
			
			
		
		System.out.println(str1);

	}



}
