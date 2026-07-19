class Solution {
    public long coloredCells(int n) {
        long x=4;
        long res=1;
        n=n-1;
        while(n>0){
            res+=x;
            x+=4;
            n--;
        }
        return res;
    }
}