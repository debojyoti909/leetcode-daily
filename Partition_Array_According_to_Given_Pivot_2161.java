class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // int l=0;
        // int h=nums.length-1;
        // int i=l-1;
        // for(int j=l;j<h;j++){
        //     if(nums[j]<pivot){
        //         i++;
        //         int temp=nums[j];
        //         nums[j]=nums[i];
        //         nums[i]=temp;
        //     }
        // }
        // int temp=nums[i+1];
        // nums[i+1]=pivot;
        // pivot=temp;
        int res[]=new int[nums.length];
        int i=0;
        for(int num:nums){
            if(num<pivot){
                res[i++]=num;
            }
        }
        for(int num:nums){
            if(num==pivot){
                res[i++]=num;
            }
        }
        for(int num:nums){
            if(num>pivot){
                res[i++]=num;
            }
        }
        return res;
    }
}