class Solution {
    public int minMoves(int[] nums) {
        int tot=0;
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            tot+=(max-nums[i]);
        }
        return tot;
    }
}