class Solution {
    public int findMaxFish(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        //int res=Integer.MIN_VALUE;
        int res=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    res=Math.max(res,calculate(i,j,grid));
                }
            }
        }
        return res;
    }
    public static int calculate(int i,int j,int grid[][]){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==0){
            return 0;
        }
        int ans=grid[i][j];
        grid[i][j]=0;
        ans=ans+calculate(i+1,j,grid)+calculate(i-1,j,grid)+calculate(i,j+1,grid)+calculate(i,j-1,grid);
        return ans;
    }
}