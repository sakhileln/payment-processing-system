/**
 * Comprehensive Payment System Demo
 * Tests all payment functionality and demonstrates OOP principles
 */
public class PaymentSystemDemo {
    public static void main(String[] args) {
        System.out.println("=== PAYMENT SYSTEM COMPREHENSIVE DEMO ===\n");

        // Create payment processor
        PaymentProcessor processor = new PaymentProcessor();

        // Create different payment methods
        System.out.println("--- Creating Payment Methods ---");

        // Credit Card with R50,000 limit
        CreditCard creditCard = new CreditCard("Alice Smith", "CC-001", 50000.0);
        processor.addPaymentMethod(creditCard);
        System.out.println("✓ Created Credit Card for Alice Smith (R50,000 limit)");

        // Debit Card with R20,000 balance
        DebitCard debitCard = new DebitCard("Bob Jones", "DC-001", 20000.0);
        processor.addPaymentMethod(debitCard);
        System.out.println("✓ Created Debit Card for Bob Jones (R20,000 balance)");

        // Cryptocurrency with R30,000 balance, medium congestion
        CryptoCurrency crypto = new CryptoCurrency("Charlie Brown", "BTC-001", 30000.0, 3);
        processor.addPaymentMethod(crypto);
        System.out.println("✓ Created Cryptocurrency for Charlie Brown (R30,000 balance, congestion level 3)");

        System.out.println("\n--- Initial State Report ---");
        System.out.println(processor.generateReport());

        System.out.println("\n--- Test 1: Process Various Payments ---");

        // Test credit card payment
        boolean success1 = processor.processTransaction("CC-001", 1500.0);
        System.out.println("Credit Card payment R1,500: " + (success1 ? "SUCCESS" : "FAILED"));

        // Test debit card payment
        boolean success2 = processor.processTransaction("DC-001", 800.0);
        System.out.println("Debit Card payment R800: " + (success2 ? "SUCCESS" : "FAILED"));

        // Test crypto payment
        boolean success3 = processor.processTransaction("BTC-001", 1200.0);
        System.out.println("Crypto payment R1,200: " + (success3 ? "SUCCESS" : "FAILED"));

        System.out.println("\n--- Test 2: Check Updated Balances ---");
        System.out.println("Credit Card balance: R" + String.format("%.2f", creditCard.getBalance()));
        System.out.println("Debit Card balance: R" + String.format("%.2f", debitCard.getBalance()));
        System.out.println("Crypto balance: R" + String.format("%.2f", crypto.getBalance()));

        System.out.println("\n--- Test 3: Test Rewards ---");
        System.out.println("Credit Card reward points: " + creditCard.getRewardPoints());
        System.out.println("Crypto reward points: " + crypto.getRewardPoints());

        System.out.println("\n--- Test 4: Test Refunds ---");
        // Test credit card refund (should work)
        boolean refund1 = processor.processRefund("CC-001", 500.0);
        System.out.println("Credit Card refund R500: " + (refund1 ? "SUCCESS" : "FAILED"));

        // Test debit card refund (should work)
        boolean refund2 = processor.processRefund("DC-001", 200.0);
        System.out.println("Debit Card refund R200: " + (refund2 ? "SUCCESS" : "FAILED"));

        // Test crypto refund (should fail - not refundable)
        boolean refund3 = processor.processRefund("BTC-001", 100.0);
        System.out.println("Crypto refund R100: " + (refund3 ? "SUCCESS" : "FAILED (expected)"));

        System.out.println("\n--- Test 5: Edge Cases ---");
        // Try payment exceeding credit limit
        boolean fail1 = processor.processTransaction("CC-001", 60000.0); // Exceeds R50,000 limit
        System.out.println("Over-limit payment attempt: " + (fail1 ? "SUCCESS" : "FAILED (expected)"));

        // Try payment exceeding debit balance
        boolean fail2 = processor.processTransaction("DC-001", 25000.0); // Exceeds remaining balance
        System.out.println("Over-balance payment attempt: " + (fail2 ? "SUCCESS" : "FAILED (expected)"));

        // Test crypto with different congestion levels
        crypto.setNetworkCongestion(5); // High congestion = higher fees
        boolean congestionTest = processor.processTransaction("BTC-001", 500.0);
        System.out.println("High congestion crypto payment: " + (congestionTest ? "SUCCESS" : "FAILED"));

        System.out.println("\n--- Test 6: Polymorphism Demo ---");
        System.out.println("All payment methods as PaymentMethod objects:");
        for (PaymentMethod pm : processor.getPaymentMethods()) {
            System.out.println("  " + pm.getAccountHolder() + " (" + pm.getPaymentType() + "): R" + String.format("%.2f", pm.getBalance()));
        }

        System.out.println("\n--- Final Report ---");
        System.out.println(processor.generateReport());

        System.out.println("\n--- Reward Summary ---");
        System.out.println(processor.getRewardSummary());

        System.out.println("\nTotal Fees Collected: R" + String.format("%.2f", processor.getTotalFeesCollected()));

        System.out.println("\n=== DEMO COMPLETE ===");
        System.out.println("✓ Demonstrated Encapsulation (private fields, controlled access)");
        System.out.println("✓ Demonstrated Abstraction (abstract methods, interfaces)");
        System.out.println("✓ Demonstrated Inheritance (CreditCard extends PaymentMethod)");
        System.out.println("✓ Demonstrated Polymorphism (PaymentProcessor handles all types uniformly)");
    }
}
