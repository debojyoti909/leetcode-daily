class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int res=0;
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==target){
                    cnt++;
                }
                int diff=j-i+1;
                if(cnt*2>diff){
                    res++;
                }
                //if(cnt>=(j-i))
            }
        }
        return res;
    }
}