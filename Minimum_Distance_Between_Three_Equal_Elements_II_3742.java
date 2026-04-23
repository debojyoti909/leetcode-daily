import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Minimum_Distance_Between_Three_Equal_Elements_II_3742 {
    class Solution {
    public int minimumDistance(int[] nums) {
        //int arr[]=nums;
        //Arrays.sort(arr);
        HashMap<Integer,ArrayList<Integer>>m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.putIfAbsent(nums[i],new ArrayList<>());
            m.get(nums[i]).add(i);
        }
        int res=Integer.MAX_VALUE;
        //int chk=0;
        for(int k:m.keySet()){
            ArrayList<Integer> l=m.get(k);
            if(l.size()<3){
                continue;
                //chk=0;
            }
            Collections.sort(l);
            for(int i=0;i+2<l.size();i++){
                // if(i+2>=nums.length){
                //     break;
                // }
                int dis=Math.abs(l.get(i)-l.get(i+1))+Math.abs(l.get(i+1)-l.get(i+2))+Math.abs(l.get(i)-l.get(i+2));
                res=Math.min(res,dis);
            }
            //for(Int i=0;i<l.si)
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}
}
