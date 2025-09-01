package arrays;

import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		
		for(int i=0;i<array.length;i++) {
			array[i] = sc.nextInt();
		}
		for(int i=0;i<array.length;i++) {
			if(array[i]==0) {
				System.out.println("Number is Zero");
			}
			else if(array[i] > 0) {
				System.out.println("Positive number");
			}
			else {
				System.out.println("Negative number");
			}
			
		}
		if(array[0] == array[array.length-1]) {
			System.out.println("Number are Equal");
		}
		else if(array[0] > array[array.length-1]) {
			System.out.println("first is less than last");
		}
		else {
			System.out.println("First is greater than last");
		}

	}

}
