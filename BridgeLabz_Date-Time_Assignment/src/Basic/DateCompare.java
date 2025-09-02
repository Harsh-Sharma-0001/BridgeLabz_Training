package Basic;

import java.time.*;
import java.util.Scanner;
public class DateCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date 1 (dd-MM-yyyy)");
		String inputDate1 = sc.nextLine();
		
		System.out.println("Enter the date 2 (dd-MM-yyyy)");
		String inputDate2 = sc.nextLine();
		
		 LocalDate date1 = LocalDate.parse(inputDate1);
         LocalDate date2 = LocalDate.parse(inputDate2);
         
         if (date1.isBefore(date2)) {
             System.out.println("The first date is before the second date.");
         } else if (date1.isAfter(date2)) {
             System.out.println("The first date is after the second date.");
         } else { // date1.isEqual(date2)
             System.out.println("The first date is the same as the second date.");
         }
		

	}

}
