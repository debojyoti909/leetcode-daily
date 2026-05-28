import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_Matrix_by_Diagonals_3446 {
    class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int m=grid.length;
        //int n=grid[0].length;
        // int i=0;
        // int j=0;
        for(int i=0;i<m;i++){
            //int res[]=new int[m];
            List<Integer>res=new ArrayList<>();
            int l=i;
            int h=0;
            //int ind=0;
            while(l<m && h<m){
                //res[ind]=grid[l][h];
                res.add(grid[l][h]);
                l++;
                h++;
                //ind++;
            }
            Collections.sort(res,Collections.reverseOrder());
            l=i;
            h=0;
            int ind=0;
            while(l<m && h<m){
                grid[l][h]=res.get(ind);
                l++;
                h++;
                ind++;
            }
        }
        for(int j=1;j<m;j++){
            //int res[]=new int[m];
            List<Integer>res=new ArrayList<>();
            int l=0;
            int h=j;
            //int ind=0;
            while(l<m && h<m){
                res.add(grid[l][h]);
                l++;
                h++;
                //ind++;
            }
            Collections.sort(res);
            l=0;
            h=j;
            int ind=0;
            while(l<m && h<m){
                grid[l][h]=res.get(ind);
                l++;
                h++;
                ind++;
            }
        }
        return grid;
    }
}
}
