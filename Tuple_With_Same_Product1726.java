import java.util.*;
class Solution {
    public int tupleSameProduct(int[] nums) {
    int count=0;
    HashMap<Integer,Integer>map =new HashMap<>();
    // Arrays.sort(nums);
    int n=nums.length;
    // for(int i=0;i<n;i++){
    //     for(int j=i+1;j<n;j++){
    //         int target=nums[i]*nums[j];
    //         int l=j+1;
    //         int r=n-1;
    //         while(l<r){
    //             int curr=nums[l]*nums[r];
    //             if(curr==target){
    //                 count++;
    //                 l++;
    //                 r--;
    //             }else if(curr<target){
    //                 l++;
    //             }else{
    //                 r--;
    //             }
    //         }
    //     }
    // }
    // return count;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            int curr=nums[i]*nums[j];
            if(map.containsKey(curr)){
                count+=map.get(curr);
            }
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
    }
    return count*8;
    }
}