package solutions;
/*
Say you have an array for which the ith element is the price of a given 
stock on day i.

If you were only permitted to complete at most one transaction (ie, buy 
one and sell one share of the stock), design an algorithm to find the 
maximum profit.

Example 1:

Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be 
larger than buying price)

Example 2:

Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.
*/
public class Q121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int buy = 0; buy < prices.length; buy++){
        	for (int sell = buy; sell < prices.length; sell++){
        		int profit = prices[sell] - prices[buy];
        		maxProfit = Math.max(maxProfit, profit);
        		
        	}
        }        
        return maxProfit;
    }
    public static void main(String[] args){
    	Q121_BestTimeToBuyAndSellStock test = new Q121_BestTimeToBuyAndSellStock();
    	System.out.println(test.maxProfit(new int[] {7,6,5,4,3,2}));
    }
}
