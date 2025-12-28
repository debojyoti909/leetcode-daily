import java,util.*;
class Solution {
    public int mostBooked(int n, int[][] meetings) {
        int metc[]=new int[n];
        long endt[]=new long[n];
        Arrays.sort(meetings,(a,b)->a[0]-b[0]);
        for(int m[]:meetings){
            int st=m[0];
            int en=m[1];
            int d=en-st;
            int free=-1;
            for(int i=0;i<n;i++){
                if(endt[i]<=st){
                    free=i;
                    break;
                }
            }
            if(free!=-1){
                endt[free]=st+d;
                metc[free]++;
            }else{
                int eroom=0;
                long time=endt[0];
                for(int i=1;i<n;i++){
                    if(endt[i]<time){
                        time=endt[i];
                        eroom=i;
                    }
                }
                endt[eroom]=time+d;
                metc[eroom]++;
            }
        }
        int max=0;
        int room=0;
        for(int i=0;i<n;i++){
            if(metc[i]>max){
                max=metc[i];
                room=i;
            }
        }
        return room;
    }
}