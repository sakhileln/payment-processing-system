/**
 * CryptoCurrency implementation.
 *
 * Requirements:
 * - Extends PaymentMethod
 * - Implements RewardEarning only (crypto is NOT refundable!)
 * - Balance represents amount of cryptocurrency
 * - Transaction fee: 1-5% based on network congestion (1=low, 5=high) (R)
 * - Reward rate: 4.5 points per rand (3x normal rate)
 * - Has network congestion level (1-5)
 * - Higher congestion = higher fees
 */
public class CryptoCurrency extends PaymentMethod implements RewardEarning {
    private int networkCongestion; // 1-5
    private int rewardPoints;
    private static final double BASE_FEE_RATE = 0.01; // 1%
    private static final double REWARD_RATE = 4.5;

    public CryptoCurrency(String accountHolder, String accountId, double initialBalance, int congestionLevel) {
        // TODO: Call parent constructor
        super(accountHolder, accountId, initialBalance)
        // TODO: Initialize network congestion (ensure it's between 1-5)
        // TODO: Initialize reward points
        setNetworkCongestion(congestionLevel);
        this.rewardPoints = 0;
    }

    @Override
    public boolean processPayment(double amount) {
        // TODO: Implement payment processing
        // 1. Check if active
        // 2. Calculate fee based on current congestion
        // 3. Calculate total cost (amount + fee)
        // 4. Check if sufficient balance
        // 5. If yes: deduct from balance, add rewards, return true
        // 6. If no: return false
        if (!isActive()) {
            return false;
        }

        double fee = getNetworkCongestion() * BASE_FEE_RATE;
        double total = amount + fee;
        if (getBalance() >= total) {
            balance -= total;
            addRewardPoints(amount);
            return true;
        }
        return false;
    }

    @Override
    public String getPaymentType() {
        // TODO: Return "Cryptocurrency"
        return "Cryptocurrency";
    }

    @Override
    public double getTransactionFee(double amount) {
        // TODO: Calculate fee based on amount and network congestion
        // Fee rate = BASE_FEE_RATE * networkCongestion
        // Example: if congestion = 3, fee rate = 1% * 3 = 3%
        double feeRate = BASE_FEE_RATE * getNetworkCongestion();
        return amount * feeRate;
    }

    @Override
    public void addRewardPoints(double amount) {
        // TODO: Add reward points based on REWARD_RATE
        if (amount > 0) {
            this.rewardPoints += (amount * REWARD_RATE);
        } else {
            this.rewardPoints += 0;
        }
    }

    @Override
    public int getRewardPoints() {
        // TODO: Return current reward points
        return rewardPoints;
    }

    @Override
    public double getRewardRate() {
        // TODO: Return REWARD_RATE
        return REWARD_RATE;
    }

    public void setNetworkCongestion(int level) {
        // TODO: Set congestion level (validate it's 1-5)
        if (level >= 1 && level <= 5) {
            this.networkCongestion = level;
        } else {
            throw new IllegalArgumentException("Network congestion must be between 1 and 5");
        }
    }

    public int getNetworkCongestion() {
        return networkCongestion;
    }
}