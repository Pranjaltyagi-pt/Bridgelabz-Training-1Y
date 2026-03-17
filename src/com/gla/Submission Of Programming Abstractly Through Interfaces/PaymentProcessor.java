interface PaymentProcessor {

    void processPayment(double amount);

    // Default method (new feature)
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed (default).");
    }
}