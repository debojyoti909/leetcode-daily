class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int prefixGcd[]=new int[n];
        int m=0;
        for(int i=0;i<n;i++){
            m=Math.max(nums[i],m);
            prefixGcd[i]=gcd(nums[i],m);
        }
        Arrays.sort(prefixGcd);
        long res=0;
        // for(int i=0;i<prefixGcd.length;i++){
        //     res+=gcd(prefixGcd[i],prefixGcd[])
        // }
        int l=0;
        int r=n-1;
        while(l<r){
            res+=gcd(prefixGcd[l],prefixGcd[r]);
            l++;
            r--;
        }
        return res;
    }
    private int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}