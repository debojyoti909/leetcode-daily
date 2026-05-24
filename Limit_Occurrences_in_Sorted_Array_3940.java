import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Limit_Occurrences_in_Sorted_Array_3940 {
    class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer>l=new ArrayList<>();
        for(int i:map.keySet()){
            int cn=map.get(i);
            for(int j=0;j<Math.min(k,cn);j++){
                l.add(i);
            }
        }
        int arr[]=new int[l.size()];
        for(int i=0;i<l.size();i++){
            arr[i]=l.get(i);
        }
        Arrays.sort(arr);
        return arr;
    }
}
}
