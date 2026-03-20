import java.util.*;
class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int col[]=new int[grid[0].length];
        int res = 0;
        for(int i=0;i<grid.length;i++){
            int r=0;
            for(int j=0;j<grid[0].length;j++){
                col[j]+=grid[i][j];
                r+=col[j];
                if(r<=k){
                    res++;
                }
            }
        }
        return res;
    }
}