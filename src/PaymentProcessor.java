import java.util.ArrayList;
import java.util.List;

/**
 * PaymentProcessor manages multiple payment methods and processes transactions.
 * This class demonstrates POLYMORPHISM by treating different payment types uniformly.
 *
 * Requirements:
 * - Store a list of payment methods
 * - Process payments using any payment method (by accountId)
 * - Process refunds (only for Refundable payment methods)
 * - Track total fees collected
 * - Generate reports showing polymorphic behavior
 */
public class PaymentProcessor {
    private List<PaymentMethod> paymentMethods;
    private double totalFeesCollected;

    public PaymentProcessor() {
        // TODO: Initialize the list and fees counter
    }

    public void addPaymentMethod(PaymentMethod paymentMethod) {
        // TODO: Add payment method to the list
    }

    /**
     * Process a transaction using the payment method with given accountId
     * @return true if successful, false otherwise
     */
    public boolean processTransaction(String accountId, double amount) {
        // TODO: Implement transaction processing
        // 1. Find the payment method with matching accountId
        // 2. If not found, return false
        // 3. Calculate the fee for this transaction
        // 4. Attempt to process payment
        // 5. If successful, add fee to totalFeesCollected
        // 6. Return result
        return false;
    }

    /**
     * Process a refund - only works for Refundable payment methods
     * @return true if successful, false otherwise
     */
    public boolean processRefund(String accountId, double amount) {
        // TODO: Implement refund processing
        // 1. Find the payment method with matching accountId
        // 2. Check if it implements Refundable interface (use instanceof)
        // 3. If it does, cast it and call refund()
        // 4. If not Refundable or refund fails, return false
        return false;
    }

    public double getTotalFeesCollected() {
        // TODO: Return total fees collected
        return 0.0;
    }

    /**
     * Get reward summary for all accounts that earn rewards
     * @return formatted string with reward information
     */
    public String getRewardSummary() {
        // TODO: Implement reward summary
        // 1. Create a StringBuilder for the output
        // 2. Loop through all payment methods
        // 3. Check if each implements RewardEarning (use instanceof)
        // 4. If yes, display accountId, holder, points, and rate
        // 5. Return the formatted string
        return "";
    }

    /**
     * Generate a comprehensive report showing polymorphic behavior
     * Demonstrates how different payment types behave differently
     */
    public String generateReport() {
        // TODO: Generate a detailed report
        // Include for each payment method:
        // - Account holder and ID
        // - Payment type (polymorphic call)
        // - Current balance
        // - Whether it's refundable (check interface)
        // - Whether it earns rewards (check interface)
        // - Sample fee for $100 transaction (polymorphic calculation)

        StringBuilder report = new StringBuilder();
        report.append("=== PAYMENT PROCESSOR REPORT ===\n\n");

        // TODO: Add details for each payment method

        report.append("\nTotal Fees Collected: $").append(String.format("%.2f", totalFeesCollected));

        return report.toString();
    }

    /**
     * Helper method to find payment method by accountId
     */
    private PaymentMethod findPaymentMethod(String accountId) {
        // TODO: Search through list and return matching payment method
        // Return null if not found
        return null;
    }
}