import java.util.ArrayList;
import java.util.List;

public class Minimum_Pair_Removal_to_Sort_Array_I_3507 {
    class Solution {
    public boolean sortchk(List<Integer>l){
        for(int i=0;i<l.size()-1;i++){
            if(l.get(i)>l.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        // int mins=Integer.MAX_VALUE;
        // int minid=-1;
        int cnt=0;
        while(!sortchk(l)){
            int mins=Integer.MAX_VALUE;
        int minid=-1;
            for(int i=0;i<l.size()-1;i++){
                if((l.get(i)+l.get(i+1))<mins){
                    mins=l.get(i)+l.get(i+1);
                    minid=i;
                }
            }
            // List<Integer>l2=new ArrayList<>();
            // l2=l[0,minid]+l[minid+1];
            // l.set(l2);
            // count++;
            int val=l.get(minid)+l.get(minid+1);
            l.remove(minid+1);
            l.set(minid,val);
            cnt++;
        }
        return cnt;
    }
}
}
