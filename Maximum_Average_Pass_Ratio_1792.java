import java.util.PriorityQueue;

public class Maximum_Average_Pass_Ratio_1792 {
    class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]>pq=new PriorityQueue<>((a,b)->Double.compare(b[0],a[0]));
        for(int arr[]:classes){
            int pass=arr[0];
            int total=arr[1];
            double preavg=(double) (pass+1)/(total+1);
            double pasavg=(double) pass/total;
            double diff=preavg-pasavg;
            pq.offer(new double[]{diff,pass,total});
        }
        while(extraStudents>0){
            double arr[]=pq.poll();
            int pass =(int)arr[1]+1;
            int total=(int)arr[2]+1;
            double preavg=(double) (pass+1)/(total+1);
            double pasavg=(double) pass/total;
            double diff=preavg-pasavg;
            pq.offer(new double[]{diff,pass,total});
            extraStudents--;
        }
        double res=0;
        while(!pq.isEmpty()){
            double arr[]=pq.poll();
            res+=(double)(arr[1]/arr[2]);
        }
        return res/classes.length;

    }
}
}
