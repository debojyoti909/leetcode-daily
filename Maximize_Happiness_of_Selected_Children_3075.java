class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n=happiness.length;
        Integer[] ha=new Integer[n];
        for(int i=0;i<n;i++){
            ha[i]=happiness[i];
        }
        Arrays.sort(ha,Collections.reverseOrder());
        long ths=0;
        int t=0;
        for(int i=0;i<k;i++){
            ths=ths+(Math.max(ha[i]-t,0));
            t++;
        }
        return ths;
    }
}