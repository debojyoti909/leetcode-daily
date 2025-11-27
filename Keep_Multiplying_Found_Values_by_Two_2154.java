import java.util.*;

class Keep_Multiplying_Found_Values_by_Two_2154 {
      public int findFinalValue(int[] nums, int original) {
        int max=Integer.MIN_VALUE;
        int res=original;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
           if(nums[i]==original){
           // res=nums[i];
            original*=2;
           }
        }
        return original;
    }
}