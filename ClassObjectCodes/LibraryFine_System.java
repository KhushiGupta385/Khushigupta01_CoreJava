
class LibraryBook {
    // Private variables (Encapsulation)
    private String bookName;
    private int daysLate;
    private double finePerDay;

    // Setter methods
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setDaysLate(int daysLate) {
        this.daysLate = daysLate;
    }

    public void setFinePerDay(double finePerDay) {
        this.finePerDay = finePerDay;
    }

    // Getter methods
    public String getBookName() {
        return bookName;
    }

    // Calculate total fine
    public double getTotalFine() {
        double totalFine = daysLate * finePerDay;

        if (daysLate > 10) {
            totalFine = totalFine + 100; // extra penalty
        }

        return totalFine;
    }
}

public class LibraryFine_System {
    public static void main(String[] args) {

        // Object creation
        LibraryBook book = new LibraryBook();

        // Setting values
        book.setBookName("Java Basics");
        book.setDaysLate(12);
        book.setFinePerDay(10);

        // Display output
        System.out.println("Book Name: " + book.getBookName());
        System.out.println("Total Fine: " + book.getTotalFine());
    }
}