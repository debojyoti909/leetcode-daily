class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int ans[]=new int[nums.size()];

        for(int i=0;i<nums.size();i++){
            int num= nums.get(i);

            if(num==2){
                ans[i]=-1;
                continue;
            }

        int numcp=num;
        int count=0;
        while((numcp&1)==1){
            count++;
            numcp=numcp>>1;
        }

        ans[i]=num-(1<<(count-1));
        }
        return ans;
    }
}