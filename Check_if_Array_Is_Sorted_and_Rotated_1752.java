class Solution {
    public boolean check(int[] nums) {
        int breakp=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
            breakp=i+1;
            }
        }
        int n=nums.length;
        for(int k=breakp;k<n+breakp-1;k++){
            if(nums[k%n]>nums[(k+1)%n]){
                return false;
            }
        }
        return true;
    }
}