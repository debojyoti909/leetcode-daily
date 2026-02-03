public class Trionic_Array_I_3637 {
    class Solution {
    public boolean inc(int nums[],int s,int j){
        boolean chk=true;
        for(int i=s;i<j;i++){
            if(nums[i]>=nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public boolean dec(int nums[],int s,int j){
        boolean chk=true;
        for(int i=s;i<j;i++){
            if(nums[i]<=nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public boolean isTrionic(int[] nums) {
        if(nums.length<3){
            return false;
        }
        for(int i=1;i<nums.length-2;i++){
            if(!inc(nums,0,i)){
                continue;
            }
            for(int j=i+1;j<nums.length-1;j++){
                if(dec(nums,i,j) && inc(nums,j,nums.length-1)){
                    return true;
                }
            }
        }
        return false;
    }
}
}
