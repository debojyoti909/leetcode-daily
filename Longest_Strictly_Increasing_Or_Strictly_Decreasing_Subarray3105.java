class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=1;
        int dec=1;
        int res=0;
        if(nums.length==1)return 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                inc+=1;
                dec=1;
            }else if(nums[i]>nums[i+1]){
                dec+=1;
                inc=1;
            }else{
                inc=dec=1;
            }
            res=Math.max(inc,Math.max(res,dec));
        }
        return res;

    }
}