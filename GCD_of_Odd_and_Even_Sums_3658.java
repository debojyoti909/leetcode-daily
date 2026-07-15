class Solution {
    public int GCD(int a,int b){
        if(b==0){
            return a;
        }
        return GCD(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        int o=0;
        int e=0;
        for(int i=1;i<=2*n;i++){
            if(i%2==0){
                e+=i;
            }else{
                o+=i;
            }
        }
        if(e>o){
        return GCD(e,o);
        }else{
            return GCD(o,e);
        }
    }
}