/**
 * Interface for payment methods that support refunds.
 * DO NOT MODIFY THIS FILE.
 */
public interface Refundable {
    boolean refund(double amount);
    double getRefundLimit();
}