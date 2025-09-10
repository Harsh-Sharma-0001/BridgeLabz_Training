class question_profitLoss {
    public static void main(String[] args) {
        int costPrice = 129, sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercent = (profit * 100.0) / costPrice;

        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + 
                           "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }
}