class Solution {
    public int paths(int m, int n, int[][] dp){
         if(m==1|| n==1){
          return 1;
         }
       if(m==0||n==0) return 0;
       if(dp[m-1][n-1] !=0) return dp[m-1][n-1];
       dp[m-1][n-1]= paths(m-1,n,dp)+paths(m,n-1,dp);
      
       return dp[m-1][n-1];
    }
    public int uniquePaths(int m, int n) {
      int[][] dp = new int[m][n];
      int res = paths(m,n,dp);
      return res;
    }
}
