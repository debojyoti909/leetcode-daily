class Solution {
    public int countValidSelections(int[] nums) {
       int arr[]=new int[nums.length];
       int prev=0;
       arr[0]=nums[0];
       for(int i=1;i<nums.length;i++){ 
        arr[i]=arr[i-1]+nums[i];
//        prev=arr[i];
       }
    int max=arr[arr.length-1];    
    
       int cnt=0;
       for(int i=0;i<arr.length;i++){
        if(nums[i]==0){
            int l=(i==0)?0:arr[i-1];
            int r=max-l;
            if(l==r){
                cnt+=2;
            }else if(l==r+1 || r==l+1){
                cnt++;
            }
        }
       }
       return cnt;
    }
}