public class Minimum_Time_Visiting_All_Points_1266 {
    class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int res=0;
        for(int i=0;i<points.length-1;i++){
            int a=Math.abs(points[i][0]-points[i+1][0]);
            int b=Math.abs(points[i][1]-points[i+1][1]);
            res+=Math.max(a,b);
        }
        return res;
    }
}
}
