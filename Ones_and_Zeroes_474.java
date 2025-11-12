import java.util.*;
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
     int dp[][]=new int[m+1][n+1];
     for(int i=0;i<strs.length;i++){
        String s=strs[i];
        int z=0;
        int o=0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='0'){
                z++;
            }else{
                o++;
            }
        }
        for(int k=m;k>=z;k--){
            for(int l=n;l>=o;l--){
                dp[k][l]=Math.max(dp[k][l],dp[k-z][l-o]+1);
            }
        }
     }   
     return dp[m][n];
    }
}