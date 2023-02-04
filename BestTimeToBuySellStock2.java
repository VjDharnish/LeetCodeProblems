/* You are given an integer array prices where prices[i] is the price of a given stock on the ith da
On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
Find and return the maximum profit you can achieve.*/
public class BestTimeToBuySellStock2 {
    public static int maxProfit(int[] prices) {
      int maxProfit =0;
      int small =prices[0];
      int big = small;
      for(int i=1;i<prices.length;i++){
          if(big<prices[i] ){
              big = prices[i];
          }
          else{
              maxProfit+= big-small;
              small =prices[i];
              big= small;
          }
        }
      maxProfit+=big-small;     
      return maxProfit;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		System.out.print(maxProfit(prices));
	}
}
