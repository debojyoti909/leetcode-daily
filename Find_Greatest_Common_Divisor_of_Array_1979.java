class Solution {
    public int gcdcal(int a,int b){
        if(b==0){
            return a;
        }
        return gcdcal(b,a%b);
    }
    public int findGCD(int[] nums) {
        //int max=Integer.MIN_VALUE;
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        int res=gcdcal(max,min);
        return res;
    }
}