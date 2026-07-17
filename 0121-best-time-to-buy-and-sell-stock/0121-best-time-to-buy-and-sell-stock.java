class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];   // Lowest price seen so far
        int profit = 0;        // Maximum profit

        for (int i = 1; i < prices.length; i++) {

            // If current price is lower, update buying price
            if (prices[i] < buy) {
                buy = prices[i];
            } else {
                // Otherwise, calculate profit if sold today
                profit = Math.max(profit, prices[i] - buy);
            }
        }

        return profit;
    }
}