public class Minimum_Element_After_Replacement_With_Digit_Sum_3300 {
    import java.util.*;
class Solution {
    public int sum(int n){
        int sum=0;
        while(n!=0){
            sum = sum+(n%10);
            n=n/10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        int chk=0;
       
        for(int i=0;i<nums.length;i++){
            chk= sum(nums[i]);
            nums[i]=chk;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}
}
