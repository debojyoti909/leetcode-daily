import java.util.HashMap;

public class Find_Lucky_Integer_in_an_Array_1394 {
    class Solution {
    public int findLucky(int[] arr) {
        //Arrays.sort(arr);
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max=-1;
        for (int i:map.keySet()){
            if(i==map.get(i)){
                max=Math.max(max,i);
            }
        }
        return max;
    }
}
}
