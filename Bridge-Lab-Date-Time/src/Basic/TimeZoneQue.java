package Basic;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;

public class TimeZoneQue {

	public static void main(String[] args) {
		
        System.out.println("Current date and time (dd-MM-yyyy HH:mm:ss)");

        // Use LocalDateTime (date + time)
//        LocalDateTime currentDateTime = LocalDateTime.now();
//        ZonedDateTime currentDateTime = ZonedDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

//        System.out.println(currentDateTime.format(formatter));
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        
        System.out.println("GMT :" + gmtTime.format(formatter));
        System.out.println("IST : " + istTime.format(formatter));
        System.out.println("PST : " + pstTime.format(formatter));
	}
}
