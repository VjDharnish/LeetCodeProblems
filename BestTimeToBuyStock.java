public class BestTimeToBuyStock {
    public static int maxProfit(int[] prices) {
       int maxProfit = 0;
       int small = prices[0];
       for(int i =1;i<prices.length;i++){
           if(small<prices[i]){
               maxProfit = Math.max(maxProfit,prices[i]-small);
           }
           else{
               small = prices[i];
           }
       }
       return maxProfit; 
    }
    public static void main(String[] args) {
    	int[] prices= {7,6,5,4,3};
    	System.out.println(maxProfit(prices));
    }
}
