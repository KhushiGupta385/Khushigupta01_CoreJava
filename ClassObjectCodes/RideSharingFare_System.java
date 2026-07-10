
class Ride {
    // Private variables (Encapsulation)
    private String customerName;
    private double distanceTravelled;
    private double pricePerKm;
    private double surgeMultiplier;

    // Setter methods
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public void setPricePerKm(double pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    public void setSurgeMultiplier(double surgeMultiplier) {
        this.surgeMultiplier = surgeMultiplier;
    }

    // Getter methods
    public String getCustomerName() {
        return customerName;
    }

    // Calculate final fare
    public double getFinalFare() {
        double baseFare = distanceTravelled * pricePerKm;
        double finalFare = baseFare * surgeMultiplier;

        // If distance > 20 km → 10% discount
        if (distanceTravelled > 20) {
            finalFare = finalFare - (finalFare * 0.10);
        }

        // If surgeMultiplier > 1.5 → add ₹50 extra charge
        if (surgeMultiplier > 1.5) {
            finalFare = finalFare + 50;
        }

        return finalFare;
    }
}

public class RideSharingFare_System {
    public static void main(String[] args) {

        // Object creation
        Ride ride = new Ride();

        // Setting values
        ride.setCustomerName("K.G");
        ride.setDistanceTravelled(25);
        ride.setPricePerKm(10);
        ride.setSurgeMultiplier(1.6);

        // Output
        System.out.println("Customer Name: " + ride.getCustomerName());
        System.out.println("Final Fare: " + ride.getFinalFare());
    }
}