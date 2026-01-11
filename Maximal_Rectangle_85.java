import java.util.*;

public class Maximal_Rectangle_85 {
    class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int res=0;
        int heights[]=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='1'){
                    heights[j]+=1;
                }else{
                    heights[j]=0;
                }
            }
            res=Math.max(res,solve(heights));
        }
        return res;
    }
    public int solve(int heights[]){
        int area=Integer.MIN_VALUE;
        Stack<Integer>s=new Stack<>();
        int n=heights.length;
        for(int i=0;i<=n;i++){
            int curr=(i==n)?0:heights[i];
            while(!s.isEmpty() && curr<heights[s.peek()]){
                int h=heights[s.pop()];
                int wi=(s.isEmpty())?-1:s.peek();
                int w=i-wi-1;
                area=Math.max(area,(h*w));
            }
            s.push(i);
        }
        return area;
    }
}
}
