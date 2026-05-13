public class Smallest_Missing_Non_negative_Integer_After_Operations_2598 {
    class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int r[]=new int[value];
        for(int i=0;i<nums.length;i++){
            int a=((nums[i]%value)+value)%value;
            r[a]++;
        }
        int m=0;
        while(r[m%value]>0){
            r[m%value]--;
            m++;
        }
        return m;
    }
}
}
