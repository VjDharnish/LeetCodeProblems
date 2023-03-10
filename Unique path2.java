class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m=obstacleGrid[0].length;
    if(n==1) {
        for(int i=0;i<m;i++){
            if(obstacleGrid[0][i]==1) return 0;
        }
        return 1;
    }
    if(m==1) {
        for(int i=0;i<n;i++){
            if(obstacleGrid[i][0]==1) return 0;
        }
        return 1;
    }

         for(int i=0; i<n; i++) {
             for(int j=0; j<m; j++){
                 if(i==0 && j==0){
                     if(obstacleGrid[i][j]==0)obstacleGrid[i][j]=1;
                     else return 0;
                 }
                 else if(obstacleGrid[i][j]==1){
                     obstacleGrid[i][j]=0;
                 }
                 else if(i==0 && j!=0){
                     obstacleGrid[i][j]= obstacleGrid[i][j-1];
                 }
                 else if(j==0 && i!=0){
                     obstacleGrid[i][j]= obstacleGrid[i-1][j];
                 }
                 else{
                     obstacleGrid[i][j]= obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
                 }
             }
         }

         return obstacleGrid[n-1][m-1];
    }
}
