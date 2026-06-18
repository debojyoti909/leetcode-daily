class Solution {
    public int partitionArray(int[] nums, int k) {
    Arrays.sort(nums);
    int c=1;
    int ini=nums[0];
    for(int i=0;i<nums.length;i++){
        if(nums[i]-ini >k){
          //  if(i+1<nums.length){
                ini=nums[i];
                c++;
            //}
        }
    }       
    return c;
    }
}