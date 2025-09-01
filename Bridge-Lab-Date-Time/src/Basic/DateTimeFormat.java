package Basic;
import java.text.Format;
import java.time.*;
import java.util.Scanner;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the date (dd-mm-yyyy)");
		Scanner sc = new Scanner(System.in);
		String inputDate  = sc.nextLine();
	
		  DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		  DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		  DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("EEE, MM dd, yyyy");

	        
	        LocalDate date = LocalDate.parse(inputDate, dateFormatter);

	        
	        System.out.println("format 1" + date.format(dateFormatter));
	        System.out.println("format 2"
	        + date.format(dateFormatter1));
	        System.out.println("format 3" + date.format(dateFormatter2));

	        
	     
	}

}
