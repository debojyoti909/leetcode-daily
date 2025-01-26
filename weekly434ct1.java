class Solution {
    public int countPartitions(int[] nums) {
       int arr[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            arr[i]=sum;
        }
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]-(arr[nums.length-1]-arr[i]))%2==0){
                count++;
            }
        }
        return count;
    }
}