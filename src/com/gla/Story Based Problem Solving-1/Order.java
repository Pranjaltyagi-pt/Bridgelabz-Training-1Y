class Order {
    int orderId;
    double baseAmount;

    static double deliveryCharge = 40;  // common for all orders

    // Constructor
    Order(int orderId, double baseAmount) {
        this.orderId = orderId;
        this.baseAmount = baseAmount;
    }

    // Method to calculate total bill
    double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}