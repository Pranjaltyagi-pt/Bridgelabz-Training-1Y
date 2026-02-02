class TotalPurchasePrice {
    public static void main(String[] args) {

        double unitPrice = 250.0;   
        int quantity = 4;           

         
        double totalPrice = unitPrice * quantity;

       
        System.out.println("The total purchase price is INR " + totalPrice +
                " if the quantity is " + quantity +
                " and unit price is INR " + unitPrice);
    }
}
