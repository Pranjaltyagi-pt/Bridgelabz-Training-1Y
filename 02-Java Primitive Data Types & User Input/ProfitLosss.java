class ProfitLoss{
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;

        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit * 100.0) / costPrice;

        System.out.println("Profit = INR " + profit);  
         System.out.println("Profit Percentage = " + profitPercentage);
    }
}
