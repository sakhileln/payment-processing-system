/**
 * DebitCard implementation.
 *
 * Requirements:
 * - Extends PaymentMethod
 * - Implements Refundable only (no rewards)
 * - Balance represents actual money in account
 * - Transaction fee: flat R25.00
 * - Cannot process if insufficient funds (balance < amount + fee)
 * - Refund limit: equal to current balance
 * - Prevent negative balances
 */
public class DebitCard extends PaymentMethod implements Refundable {
    private static final double TRANSACTION_FEE = 25.00;
    private double originalBalance; // Track for refund limit

    public DebitCard(String accountHolder, String accountId, double initialBalance) {
        // TODO: Call parent constructor

        // TODO: Store original balance for refund calculations
    }

    @Override
    public boolean processPayment(double amount) {
        // TODO: Implement payment processing
        // 1. Check if card is active
        // 2. Calculate total needed (amount + fee)
        // 3. Check if sufficient balance
        // 4. If yes: deduct from balance, return true
        // 5. If no: return false
        return false;
    }

    @Override
    public String getPaymentType() {
        // TODO: Return "Debit Card"
        return null;
    }

    @Override
    public double getTransactionFee(double amount) {
        // TODO: Return flat fee (doesn't depend on amount)
        return 0.0;
    }

    @Override
    public boolean refund(double amount) {
        // TODO: Implement refund logic
        // 1. Check if amount <= refund limit (don't exceed original balance)
        // 2. If yes: add to balance, update original balance, return true
        // 3. If no: return false
        return false;
    }

    @Override
    public double getRefundLimit() {
        // TODO: Return current balance as refund limit
        return 0.0;
    }
}