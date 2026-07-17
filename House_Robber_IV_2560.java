class Solution {
    public boolean ispos(int nums[],int k,int mid){
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid){
                cnt++;
                i++;
            }
            if(cnt>=k){
                return true;
            }
        }
        return false;
    }
    public int minCapability(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int low=min;
        int high=max;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(ispos(nums,k,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}