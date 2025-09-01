package Basic;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAirthmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the date (dd-mm-yyyy)");
		Scanner sc = new Scanner(System.in);
		String inputDate  = sc.nextLine();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		 LocalDate date = LocalDate.parse(inputDate, dateTimeFormatter);
		
		 System.out.println(date.plusDays(7));
		 System.out.println(date.plusMonths(1));
		 System.out.println(date.plusYears(2));
		 System.out.println(date.minusWeeks(4));
		
		
		
		

	}

}
