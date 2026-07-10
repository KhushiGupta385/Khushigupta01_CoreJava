
class ShoppingCart {
    // Private variables (Encapsulation)
    private String productName;
    private double price;
    private int quantity;

    // Setter methods
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getter methods
    public String getProductName() {
        return productName;
    }

    // Getter to calculate final payable amount
    public double getFinalAmount() {
        double totalCost = price * quantity;

        if (totalCost > 5000) {
            totalCost = totalCost - (totalCost * 0.10); // 10% discount
        }

        return totalCost;
    }
}

public class OnlineShopping_Cart {
    public static void main(String[] args) {

        // Object creation
        ShoppingCart cart = new ShoppingCart();

        // Setting values
        cart.setProductName("Laptop");
        cart.setPrice(3000);
        cart.setQuantity(2);

        // Display output
        System.out.println("Product Name: " + cart.getProductName());
        System.out.println("Final Payable Amount: " + cart.getFinalAmount());
    }
}