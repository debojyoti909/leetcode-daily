class Solution {
    public int maxPathScore(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][][]=new int[m][n][k+1];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            Arrays.fill(dp[i][j],-1);
        }
    }
    dp[0][0][0]=0;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            for(int c=0;c<=k;c++){
                if(dp[i][j][c]==-1){
                    continue;
                }
                int cur=dp[i][j][c];
                if(i+1<m){
                    int v=grid[i+1][j];
                    int co=c+(v==0?0:1);
                    int sc=cur+(v==2?2:(v==1?1:0));
                    if(co<=k){
                        dp[i+1][j][co]=Math.max(dp[i+1][j][co],sc);
                    }

                }
                if(j+1<n){
                        int v=grid[i][j+1];
                    int co=c+(v==0?0:1);
                    int sc=cur+(v==2?2:(v==1?1:0));
                    if(co<=k){
                        dp[i][j+1][co]=Math.max(dp[i][j+1][co],sc);
                    }
                }
            }
        }
    }
    int res=-1;
    for(int l=0;l<=k;l++){
        res=Math.max(res,dp[m-1][n-1][l]);
    }
    return res;
    }
}