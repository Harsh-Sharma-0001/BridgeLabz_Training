package String.Level3;
import java.util.Scanner;

public class CalendarDisplay {

    static String[] months = {"", "January", "February", "March", "April", "May", "June", 
                              "July", "August", "September", "October", "November", "December"};

    // Leap Year Check
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Number of days in month
    public static int daysInMonth(int month, int year) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) return 29;
        return days[month];
    }

    // Get first day of month (0=Sun, 1=Mon,...)
    public static int firstDayOfMonth(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }

    public static void printCalendar(int month, int year) {
        System.out.println("   " + months[month] + " " + year);
        System.out.println(" Su Mo Tu We Th Fr Sa");

        int firstDay = firstDayOfMonth(month, year);
        int days = daysInMonth(month, year);

        // Initial spaces
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Print days
        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d", d);
            if ((d + firstDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
    }
}
