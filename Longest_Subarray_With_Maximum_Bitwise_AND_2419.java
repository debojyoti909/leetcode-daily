import java.util.*;
class Solution {
    // public static void subsets(int nums[],ArrayList<Integer>list,int i){
    //     if(i==nums.length){
    //         return;
    //     }
    //     subsets(nums[],list.add(nums[i]),i+1);
    //     subsets(nums[],list,i+1);
    // }
    public int longestSubarray(int[] nums) {
        int max=0;
        int count=0;
        // ArrayList<Integer>list= new ArrayList<>();
        // subsets(nums[],list,0);
        // for(int i=0;i<list.size();i++){
        //     for(int j=0;j<list[i].)
        // }
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        int temp_len=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                temp_len++;
            }else{
                count=Math.max(count,temp_len);
                temp_len=0;
            }
        }
        return Math.max(count,temp_len);

    }
}