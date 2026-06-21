import java.util.Arrays;

public class Minimize_the_Maximum_Difference_of_Pairs_2616 {
    class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        if(p==0)return 0;
        if(2*p>nums.length)return 0;
        //return nums[2*p-1]-nums[2*p-2];
        int low=0;
        int high=nums[nums.length-1]-nums[0];
        while(low<high){
            int mid=(low+high)/2;
            int c=0;
            for(int i=1;i<nums.length;i++){
                if(Math.abs(nums[i]-nums[i-1])<=mid){
                    c++;
                    i++;
                }
            }
            if(c>=p){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
}
