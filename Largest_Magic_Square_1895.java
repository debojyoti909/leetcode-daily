class Solution {
    public boolean check(int grid[][],int row,int col,int prefr[][],int prefc[][],int s){
        int target=prefr[row][col+s]-prefr[row][col];
        for(int i=row;i<row+s;i++){
            if(prefr[i][col+s]-prefr[i][col]!=target){
                return false;
            }
        }
        for(int j=col;j<col+s;j++){
            if(prefc[row+s][j]-prefc[row][j]!=target){
                return false;
            }
        }
        int d1=0;
        int d2=0;
        for(int i=0;i<s;i++){
            d1+=grid[row+i][col+i];
            d2+=grid[row+i][col+s-1-i];
        }
        if(d1!=target || d2!=target){
            return false;
        }
        return true;
    }
    public int largestMagicSquare(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int prefr[][]=new int[n][m+1];
        int prefc[][]=new int[n+1][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                prefr[i][j+1]=prefr[i][j]+grid[i][j];
                prefc[i+1][j]=prefc[i][j]+grid[i][j];
            }
        }
        int ms=Math.min(m,n);
        while(ms>=2){
            for(int i=0;i+ms<=n;i++){
                for(int j=0;j+ms<=m;j++){
                    if(check(grid,i,j,prefr,prefc,ms)){
                        return ms;
                    }
                }
            }
            ms--;
        }
        return 1;
    }
}