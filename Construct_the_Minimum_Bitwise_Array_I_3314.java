import java.util.List;

public class Construct_the_Minimum_Bitwise_Array_I_3314 {
    class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int res[]=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            int a= nums.get(i);
            if(a%2==0){
                res[i]=-1;
            }else{
                res[i]=a-((a+1)&(-a-1))/2;
            }
        }
        return res;
    }
}
}
