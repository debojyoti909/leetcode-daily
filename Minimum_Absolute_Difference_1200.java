import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Minimum_Absolute_Difference_1200 {
    class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
        HashMap<Integer,List<List<Integer>>>map=new HashMap<>();
        for(int i=0;i<arr.length-1;i++){
            int diff=Math.abs(arr[i]-arr[i+1]);
            min=Math.min(diff,min);
            if(!map.containsKey(diff)){
                map.put(diff,new ArrayList<List<Integer>>());
                //map.get(diff).add(new ArrayList<ArrayList<Integer>>{arr[i],arr[i+1]});
            }
            List<Integer>pair=new ArrayList<>();
            pair.add(arr[i]);
            pair.add(arr[i+1]);
            map.get(diff).add(pair);

        }
        return map.get(min);
    }
}
}
