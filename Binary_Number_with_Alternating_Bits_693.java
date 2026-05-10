public class Binary_Number_with_Alternating_Bits_693 {
    class Solution {
    public boolean hasAlternatingBits(int n) {
        int chk=-1;
        while(n!=0){
            int mod=n%2;
            if(mod!=chk){
                chk=mod;
            }else{
                return false;
            }
            n=n/2;
        }
    return true;
    }
}
}
