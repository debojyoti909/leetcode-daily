class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int a=0;
        for(int i=0;i<nums.length;i++){
            while((long)nums[i]>(long)nums[l]*k){
                l++;
            }
            a=Math.max(a,i-l+1);
        }
        //return nums.length-l;
        return nums.length-a;
    }
}