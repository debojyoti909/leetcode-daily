import java.utilo.*;
public class Find_Minimum_Operations_to_Make_All_Elements_Divisible_by_Three_3190 {
    
    public int minimumOperations(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0){
                cnt++;
            }
        }
        return cnt;
    }
}

