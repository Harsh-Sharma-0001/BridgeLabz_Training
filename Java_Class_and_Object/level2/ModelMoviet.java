class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor to initialize with movie name and base price
    public MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.isBooked = false;
        this.seatNumber = "";
    }

    // Method to book a ticket by assigning seat number and confirming price
    public void bookTicket(String seatNumber) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.isBooked = true;
            System.out.println("Ticket booked successfully for seat " + seatNumber);
        } else {
            System.out.println("Sorry, ticket already booked for seat " + this.seatNumber);
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.printf("Price: $%.2f\n", price);
        } else {
            System.out.println("Ticket not booked yet.");
        }
    }
}

public class ModelMoviet {
    public static void main(String[] args) {
        // Create a ticket for a movie with a base price
        MovieTicket ticket = new MovieTicket("Avengers: Endgame", 12.5);

        // Display ticket details before booking
        ticket.displayTicketDetails();

        // Book the ticket
        ticket.bookTicket("A10");

        // Try booking again for the same ticket (should show already booked)
        ticket.bookTicket("A11");

        // Display ticket details after booking
        ticket.displayTicketDetails();
    }
}