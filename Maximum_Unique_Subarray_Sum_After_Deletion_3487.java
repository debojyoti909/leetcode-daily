class Solution {
    public int maxSum(int[] nums) {
        Set<Integer>s=new HashSet<>();
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            if(!s.contains(nums[i])){
                if(nums[i]>=0){
                    sum+=nums[i];
                }
                s.add(nums[i]);
            }
        }
        if(max<0){
            return max;
        }
        return  sum;
    }
}