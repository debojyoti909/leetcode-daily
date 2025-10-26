class Solution {
    public long maxAlternatingSum(int[] nums) {
        long arr[]=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=(long)nums[i]*(long)nums[i];
        }
        Arrays.sort(arr);
        int n=arr.length;
        long sum=0;
        for(int i=0;i<n/2;i++){
            sum-=arr[i];
        }
        for(int i=n/2;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
}