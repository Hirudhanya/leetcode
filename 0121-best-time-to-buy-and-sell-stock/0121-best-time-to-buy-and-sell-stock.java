class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int bestBuy = prices[0];
        for(int i =1; i<prices.length; i++){
            int currprice = prices[i];
            if(currprice>bestBuy){
                profit = Math.max(profit, currprice -  bestBuy);
            }
            bestBuy = Math.min(bestBuy, currprice);
        }
        return profit;

    }
}