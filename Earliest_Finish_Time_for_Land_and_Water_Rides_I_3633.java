class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int fin=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                int ls=landStartTime[i];
                int le=ls+landDuration[i];
                int ws=Math.max(le,waterStartTime[j]);
                int we=ws+waterDuration[j];
                fin=Math.min(fin,we);
            }
        }
        for(int i=0;i<waterStartTime.length;i++){
            for(int j=0;j<landStartTime.length;j++){
                int ws=waterStartTime[i];
                int we=ws+waterDuration[i];
                int ls=Math.max(we,landStartTime[j]);
                int le=ls+landDuration[j];
                fin=Math.min(fin,le);
            }
        }
        return fin;
    }
}