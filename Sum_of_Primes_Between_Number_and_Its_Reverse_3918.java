public class Sum_of_Primes_Between_Number_and_Its_Reverse_3918 {
    class Solution {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int rev=0;
        int dup=n;
        while(dup!=0){
            int mod=dup%10;
            rev=rev*10+mod;
            dup=dup/10;
        }
        int min=Math.min(rev,n);
        int max=Math.max(rev,n);
        int sum=0;
        for(int i=min;i<=max;i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }
}
}
