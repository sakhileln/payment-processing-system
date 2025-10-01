/**
 * Abstract base class representing a payment method.
 * DO NOT MODIFY THIS FILE.
 */
public abstract class PaymentMethod {
    private String accountHolder;
    private String accountId;
    protected double balance;
    private boolean isActive;

    public PaymentMethod(String accountHolder, String accountId, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountId = accountId;
        this.balance = initialBalance;
        this.isActive = true;
    }

    // Abstract methods - must be implemented by subclasses
    public abstract boolean processPayment(double amount);
    public abstract String getPaymentType();
    public abstract double getTransactionFee(double amount);

    // Concrete methods
    public boolean isActive() {
        return isActive;
    }

    public void deactivate() {
        isActive = false;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }
}