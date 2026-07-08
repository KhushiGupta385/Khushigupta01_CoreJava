
class ElectricityBill {
    // Private variables
    private String customerName;
    private int unitsConsumed;
    private double pricePerUnit;

    // Setter methods
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    // Getter methods
    public String getCustomerName() {
        return customerName;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    // Getter to calculate final bill
    public double getTotalBill() {
        double totalBill = unitsConsumed * pricePerUnit;

        if (unitsConsumed > 500) {
            totalBill += totalBill * 0.10; // 10% surcharge
        }

        return totalBill;
    }
}

public class ElectricityBillSystem {
    public static void main(String[] args) {
        // Object creation
        ElectricityBill bill = new ElectricityBill();

        // Setting values
        bill.setCustomerName("Khushi");
        bill.setUnitsConsumed(600);
        bill.setPricePerUnit(8);

        // Displaying final bill
        System.out.println("Customer Name: " + bill.getCustomerName());
        System.out.println("Final Bill: " + bill.getTotalBill());
    }
}