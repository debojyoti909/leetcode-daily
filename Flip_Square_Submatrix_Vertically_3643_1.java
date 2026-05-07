public class Flip_Square_Submatrix_Vertically_3643_1 {
    
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int row=x;
        int col=x+k-1;
        while(row<col){
            for(int i=0;i<k;i++){
                int t=grid[row][y+i];
                grid[row][y+i]=grid[col][y+i];
                grid[col][y+i]=t;
            }
            row++;
            col--;
        }
        return grid;
    }

}
