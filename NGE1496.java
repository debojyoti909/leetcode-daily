import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>st=new Stack<>();
        HashMap<Integer,Integer>map=new HashMap<>();
//        int arr[]=new int[nums2.length];
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                st.pop();
            }
            map.put(nums2[i],st.isEmpty()?-1:st.peek());
            st.push(nums2[i]);
        }
         int res[]=new int[nums1.length];
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         if(nums1[i]==nums2[j]){
        //             res[i]=arr[j];
        //         }
        //     }
        // }
        for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }
        return res;
    }
}