class Solution {
    private boolean chk(int candies[],long K,int mid){
        long cnt=0;
        for(int i=0;i<candies.length;i++){
            cnt+=candies[i]/mid;
        }
        return cnt>=K;
    }
    public int maximumCandies(int[] candies, long k) {
        long tot=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            tot+=candies[i];
            min=Math.min(min,candies[i]);
            max=Math.max(max,candies[i]);
        }
        if(tot<k){
            return 0;
        }
        int low=1;
        int high=max;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(chk(candies,k,mid)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
        
    }
}