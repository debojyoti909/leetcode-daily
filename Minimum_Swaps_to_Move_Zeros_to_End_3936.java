class Solution {
    public int minimumSwaps(int[] nums) {
        int cnt=0;
        for(int i:nums){
            if(i==0){
                cnt++;
            }
        }
        int dup=cnt;
        int pos=0;
        for(int i=nums.length-1;i>=0;i--){
            if(dup==0){
                break;
            }
            if(nums[i]==0){
                pos++;
            }
            dup--;
        }
        return cnt-pos;
    }
}