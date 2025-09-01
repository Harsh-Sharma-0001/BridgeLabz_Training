package Basic;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date and time (DD-MM-YYYY HH:mm:ss)");
		String inputDate = sc.nextLine();
		
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	        LocalDate date = LocalDate.parse(inputDate, formatter);

	        // Step 3: Find the day of the week
	        DayOfWeek dayOfWeek = date.getDayOfWeek();
	        System.out.println("Day of the Week: " + dayOfWeek);

	        // Step 4: Calculate the difference between input date and current date
	        LocalDate currentDate = LocalDate.now();
	        long daysBetween = ChronoUnit.DAYS.between(date, currentDate);
	        System.out.println("Days between input date and current date: " + daysBetween);
	        
	        // for current date time display
	        
	        LocalDateTime currentDateTime = LocalDateTime.now();
	        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	        System.out.println("Current Date and Time: " + currentDateTime.format(dateTimeFormatter));

		


	}

}
