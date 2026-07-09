class BankAccount {
    // Private variables (Encapsulation)
    private String accountHolder;
    private double balance;
    private double withdrawAmount;

    // Setter methods
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    // Getter methods
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Getter logic for withdrawal
    public void processWithdrawal() {
        if (withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class BankWithdrawal_Story {
    public static void main(String[] args) {

        // Object creation
        BankAccount acc = new BankAccount();

        // Setting values using setters
        acc.setAccountHolder("Khushi");
        acc.setBalance(5000);
        acc.setWithdrawAmount(2000);

        // Display account holder
        System.out.println("Account Holder: " + acc.getAccountHolder());

        // Process withdrawal
        acc.processWithdrawal();

        // Display remaining balance
        System.out.println("Remaining Balance: " + acc.getBalance());
    }
}
