class Solution {
    public static int divtot(int nums[],int div){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(int)Math.ceil((double)nums[i]/(double)div);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int low=1;
        int high=max;
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            int sum=divtot(nums,mid);
            if(sum<=threshold){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}