class Solution {
    public long removeZeros(long n) {
        long sum=0;
        long n1=n;
        while(n1>0){
            long mod=n1%10;
            if(mod!=0){
            sum=sum*10+(long)mod;
            }
            n1=n1/10;
        }
        long res=0;
        while(sum>0){
            res=res*10+(sum%10);
            sum=sum/10;
        }
        return res;
    }
}