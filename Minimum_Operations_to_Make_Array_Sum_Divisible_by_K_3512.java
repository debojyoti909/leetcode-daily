public class Minimum_Operations_to_Make_Array_Sum_Divisible_by_K_3512 {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum%k;
    }
}

