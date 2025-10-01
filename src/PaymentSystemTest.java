/**
 * Test driver for the Payment Processing System
 * Complete the TODOs to test your implementation
 */
public class PaymentSystemTest {
    public static void main(String[] args) {
        System.out.println("=== Payment Processing System Test ===\n");

        // Create payment processor
        PaymentProcessor processor = new PaymentProcessor();

        // TODO: Create a credit card with $5000 limit
        // CreditCard creditCard = new CreditCard("Alice Smith", "CC-001", 5000.0);

        // TODO: Create a debit card with $2000 balance
        // DebitCard debitCard = new DebitCard("Bob Jones", "DC-001", 2000.0);

        // TODO: Create cryptocurrency with $3000 balance and congestion level 3
        // CryptoCurrency crypto = new CryptoCurrency("Charlie Brown", "BTC-001", 3000.0, 3);

        // TODO: Add all payment methods to processor
        // processor.addPaymentMethod(creditCard);
        // processor.addPaymentMethod(debitCard);
        // processor.addPaymentMethod(crypto);

        System.out.println("--- Initial Report ---");
        // TODO: Print initial report
        // System.out.println(processor.generateReport());

        System.out.println("\n--- Test 1: Process Payments ---");
        // TODO: Process $500 payment with credit card
        // TODO: Process $300 payment with debit card
        // TODO: Process $200 payment with crypto

        System.out.println("\n--- Test 2: Check Balances and Rewards ---");
        // TODO: Print balance for each payment method
        // TODO: Print reward summary

        System.out.println("\n--- Test 3: Test Refunds ---");
        // TODO: Try to refund $100 to credit card (should work)
        // TODO: Try to refund $50 to debit card (should work)
        // TODO: Try to refund $25 to crypto (should FAIL - not refundable)

        System.out.println("\n--- Test 4: Edge Cases ---");
        // TODO: Try payment exceeding credit limit
        // TODO: Try payment exceeding debit balance
        // TODO: Change crypto congestion and process another payment

        System.out.println("\n--- Final Report ---");
        // TODO: Print final report showing all changes
        // System.out.println(processor.generateReport());

        System.out.println("\nTotal Fees Collected: $" + processor.getTotalFeesCollected());
    }
}