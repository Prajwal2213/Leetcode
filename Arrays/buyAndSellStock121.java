//121. Best Time to Buy and Sell Stock
//My Solution
class Solution {
    public int maxProfit(int[] prices) {
       int max = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j] > prices[i] && (prices[j] - prices[i])>max){
                    max = prices[j] - prices[i];
                }
            }
        }

        if(max == 0){
            return 0;
        }else{
            return max;
        }
    }
 }

 
 //Optimal Solution
 class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }

            profit = Math.max(profit, prices[i] - buyPrice);
        }

        return profit;        
    }
}