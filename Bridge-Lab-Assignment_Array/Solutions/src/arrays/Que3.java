package arrays;
import java.util.*;
public class Que3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tab = sc.nextInt();
		
		int tabs[] = new int[10];
		for(int i=0;i<10;i++) {
			tabs[i] = tab*(i+1);
	
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(tab +" * " + (i+1) +" = "+ tabs[i]);
			
		}

	}

}
