public class Count_Indices_With_Opposite_Parity_3917 {
    class Solution {
    public int[] countOppositeParity(int[] nums) {
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                res[i]=0;
            }
            int cnt=0;
            if(nums[i]%2==0){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]%2!=0){
                        cnt++;
                    }
                }
            }else{
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]%2==0){
                        cnt++;
                    }
                }

            }
            res[i]=cnt;
        }
        return res;
    }
}
}
