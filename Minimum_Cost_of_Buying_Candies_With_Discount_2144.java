import java.util.Arrays;

public class Minimum_Cost_of_Buying_Candies_With_Discount_2144 {
class Solution {
    public int minimumCost(int[] cost) {
        int res=0;
        Arrays.sort(cost);
        int k=0;
        for(int i=cost.length-1;i>=0;i--){
            if(k%3==2){
                k++;
                continue;
            }else{
                res+=cost[i];
            }
            k++;
        }
        return res;
    }
    
}   
}
