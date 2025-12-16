import java.util.*;
public class Count_the_Number_of_Computer_Unlocking_Permutations_3577 {
    public int countPermutations(int[] complexity) {
        for(int i=1;i<complexity.length;i++){
            if(complexity[i]<=complexity[0]){
                return 0;
            }
        }
        int res=1;
        int mod=1000000007;
        for(int i=2;i<complexity.length;i++){
            res=(int)(((long)res*i)%mod);
        }
        return res;
    }
}
