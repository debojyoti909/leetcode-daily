import java.util.Arrays;

public class Maximize_Expression_of_Three_Elements_3745 {
    
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int pos=0;
        return nums[nums.length-1]+nums[nums.length-2]-nums[0];
    }
}

