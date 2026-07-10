
class MovieTicket {
    // Private variables (Encapsulation)
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    // Setter methods
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    // Getter methods
    public String getMovieName() {
        return movieName;
    }

    // Getter to calculate total cost
    public double getTotalCost() {
        double totalCost = ticketPrice * numberOfTickets;

        if (numberOfTickets >= 5) {
            totalCost = totalCost - (totalCost * 0.05); // 5% discount
        }

        return totalCost;
    }
}

public class MovieTicket_Booking {
    public static void main(String[] args) {

        // Object creation
        MovieTicket ticket = new MovieTicket();

        // Setting values using setters
        ticket.setMovieName("Avengers");
        ticket.setTicketPrice(200);
        ticket.setNumberOfTickets(5);

        // Display output
        System.out.println("Movie Name: " + ticket.getMovieName());
        System.out.println("Total Price: " + ticket.getTotalCost());
    }
}