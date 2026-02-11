import java.util.*;
public class Minimum_Deletions_to_Make_String_Balanced_1653 {
    class Solution {
    public int minimumDeletions(String s) {
        int A[]=new int[s.length()];
        int B[]=new int[s.length()];
        int res=s.length();
        int b=0;
        for(int i=0;i<s.length();i++){
            B[i]=b;
            if(s.charAt(i)=='b'){
                b++;
            }
        }
        int a=0;
        for(int i=s.length()-1;i>=0;i--){
            A[i]=a;
            if(s.charAt(i)=='a'){
                a++;
            }
        }
        for(int i=0;i<s.length();i++){
            res=Math.min(res,A[i]+B[i]);
        }
        return res;

    }
}
}
