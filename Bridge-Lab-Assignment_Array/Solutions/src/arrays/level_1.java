package arrays;
import java.util.Scanner;
public class level_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] student = new int[10];
		
		for(int i=0;i<student.length;i++) {
			student[i] = sc.nextInt();
		}
		
		for(int i=0;i<student.length;i++) {
			if(student[i] < 0) {
				System.out.println("Invalid Age");
			}
			if(student[i] > 18) {
				System.out.println("Can vote of age "+ student[i]);
			}
			else {
				System.out.println("Cannot vote of age "+ student[i]);
			}
		}
		
	}

}
