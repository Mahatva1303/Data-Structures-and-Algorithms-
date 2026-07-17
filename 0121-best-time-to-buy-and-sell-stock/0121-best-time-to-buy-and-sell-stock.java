class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int buy_stock = prices[0];
        for(int i = 1;i<prices.length;i++){
        int currt_profit = prices[i] - buy_stock;
        if(currt_profit > max_profit){
            max_profit = currt_profit;
        }
        if(prices[i] < buy_stock){
            buy_stock = prices[i];
        }
        }

        return max_profit;
    }
}