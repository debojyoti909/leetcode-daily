public class Power_of_Three_326 {
    class Solution {
    public boolean isPowerOfThree(int n) {
      int m=1162261467;
      return n>0 && m%n==0;  
    }
}
}
