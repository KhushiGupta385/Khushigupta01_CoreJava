class HotelBooking {
    // Private variables (Encapsulation)
    private String guestName;
    private double roomPricePerNight;
    private int numberOfNights;

    // Setter methods
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setRoomPricePerNight(double roomPricePerNight) {
        this.roomPricePerNight = roomPricePerNight;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    // Getter methods
    public String getGuestName() {
        return guestName;
    }

    // Calculate total bill
    public double getFinalAmount() {
        double total = roomPricePerNight * numberOfNights;

        if (numberOfNights >= 7) {
            total = total - (total * 0.15); // 15% discount
        }

        return total;
    }
}

public class HotelRoom_Booking {
    public static void main(String[] args) {

        // Object creation
        HotelBooking booking = new HotelBooking();

        // Setting values
        booking.setGuestName("Ram");
        booking.setRoomPricePerNight(2000);
        booking.setNumberOfNights(8);

        // Display output
        System.out.println("Guest Name: " + booking.getGuestName());
        System.out.println("Final Amount: " + booking.getFinalAmount());
    }
}