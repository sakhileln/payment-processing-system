/**
 * CreditCard implementation.
 *
 * Requirements:
 * - Extends PaymentMethod
 * - Implements Refundable and RewardEarning
 * - Has a credit limit (balance represents AVAILABLE credit)
 * - Transaction fee: 2.5% of payment amount (R)
 * - Reward rate: 1.5 points per rand spent
 * - Refund limit: R5000 per transaction
 * - When payment is processed, reduce available credit
 * - When refund is processed, increase available credit
 */
public class CreditCard extends PaymentMethod implements Refundable, RewardEarning {
    private double creditLimit;
    private int rewardPoints;
    private static final double TRANSACTION_FEE_RATE = 0.025;
    private static final double REWARD_RATE = 1.5;
    private static final double REFUND_LIMIT = 5000.0;

    /**
     * Constructor
     * @param accountHolder name on the card
     * @param accountId card number/ID
     * @param creditLimit maximum credit available
     */
    public CreditCard(String accountHolder, String accountId, double creditLimit) {
        // TODO: Call parent constructor with appropriate parameters
        // HINT: Initial balance should equal credit limit (all credit available)
        // TODO: Initialize credit limit and reward points
        super(accountHolder, accountId, creditLimit)
        this.rewardPoints = 0;
    }

    @Override
    public boolean processPayment(double amount) {
        // TODO: Implement payment processing
        // 1. Check if card is active
        // 2. Calculate total cost (amount + transaction fee)
        // 3. Check if enough credit available (balance >= total cost)
        // 4. If yes: reduce balance, add reward points, return true
        // 5. If no: return false

        if (!isActive()) {
            return false;
        }

        double fee = getTransactionFee(amount);
        double total = amount + fee;
        if (balance >= total) {
            balance -= total;
            addRewardPoints(amount);
            return true;
        }
        return false;
    }

    @Override
    public String getPaymentType() {
        // TODO: Return "Credit Card"
        return "Credit Card";
    }

    @Override
    public double getTransactionFee(double amount) {
        // TODO: Calculate and return 2.5% fee
        return amount * TRANSACTION_FEE_RATE;
    }

    @Override
    public boolean refund(double amount) {
        // TODO: Implement refund logic
        // 1. Check if amount <= refund limit
        // 2. If yes: increase balance (restore credit), return true
        // 3. Don't let balance exceed credit limit
        // 4. If no: return false
        return false;
    }

    @Override
    public double getRefundLimit() {
        // TODO: Return the refund limit constant
        return 0.0;
    }

    @Override
    public void addRewardPoints(double amount) {
        // TODO: Add reward points based on amount spent and REWARD_RATE
        if (amount > 0) {
            this.rewardPoints += (amount * REWARD_RATE);
        } else {
            this.rewardPoints += 0;
        }
    }

    @Override
    public int getRewardPoints() {
        // TODO: Return current reward points
        return 0;
    }

    @Override
    public double getRewardRate() {
        // TODO: Return the reward rate constant
        return 0.0;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getAvailableCredit() {
        return balance; // balance represents available credit
    }
}