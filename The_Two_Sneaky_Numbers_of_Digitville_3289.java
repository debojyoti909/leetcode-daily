import java.util.*;
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       Arrays.sort(nums); 
       int arr[]= new int[2];
       int k=0;
       for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
            arr[k]=nums[i];
            k++;
            if(k==2){
                break;
            }
        }
       }
       return arr;
    }
}