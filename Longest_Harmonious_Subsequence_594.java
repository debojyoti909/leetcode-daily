class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int ind=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]-nums[ind]>1){
                ind++;
            }
            if(nums[i]-nums[ind]==1){
                max=Math.max(max,i-ind+1);
            }
        }
        return max;
    }
}