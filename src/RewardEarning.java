/**
 * Interface for payment methods with rewards programs.
 * DO NOT MODIFY THIS FILE.
 */
public interface RewardEarning {
    void addRewardPoints(double amount);
    int getRewardPoints();
    double getRewardRate(); // points per dollar
}