import java.util.HashSet;

public class Bitwise_ORs_of_Subarrays_898 {
    class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        HashSet<Integer>a=new HashSet();
        HashSet<Integer>b=new HashSet();
        b.add(0);
        for (int i:arr){
            HashSet<Integer>c=new HashSet();
            for(int j:b){
                c.add(i|j);
            }
            c.add(i);
            b=c;
            a.addAll(b);
        }
        return a.size();
    }
}
}
