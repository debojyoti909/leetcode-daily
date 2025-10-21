class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        if(nums.length==1){
            return 1;
        }
        Arrays.sort(nums);
        int op=0;
        int res=1;
        int diff[]=new int[nums.length-1];
        int l=0;
        for(int i=1;i<nums.length;i++){
            while(nums[i]-nums[l]>2*k){
                l++;
            }
            int ws=i-l+1;
        res=Math.max(res,Math.min(ws,1+numOperations));
        }
        int cnt=0;
        for(int i=0;i<diff.length;i++){
            if(diff[i]==0){
                cnt++;
            }
        }
        //return cnt+1;
        return res;
    }
}