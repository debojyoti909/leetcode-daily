class Solution {
    public int minimumDistance(int[] nums) {
        int res=Integer.MAX_VALUE;
        int chk=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                        int dis=k-i;
                        res=Math.min(res,dis);
                        chk=1;
                    }
                }
            }
        }
        if(chk==0){
            return -1;
        }
        return 2*res;
    }
}