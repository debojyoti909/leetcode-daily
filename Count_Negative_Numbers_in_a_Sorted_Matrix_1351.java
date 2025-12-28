public class Count_Negative_Numbers_in_a_Sorted_Matrix_1351 {
    class Solution {
    public int countNegatives(int[][] grid) {
        int cnt=0;
        for(int i=0;i<grid.length;i++){
            for(int j=grid[0].length-1;j>=0;j--){
                if(grid[i][j]>=0){
                    break;
                }
                cnt++;
            }
        }
        return cnt;
    }
}
}
