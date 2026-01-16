import java.util.Arrays;
import java.util.HashSet;

public class Maximum_Square_Area_by_Removing_Fences_From_a_Field_2975 {
    class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        if(m==n){
            return (m-1)*(n-1);
        }
        int h[]=new int[hFences.length+2];
        int v[]=new int[vFences.length+2];
        h[0]=1;
        h[h.length-1]=m;
        v[0]=1;
        v[v.length-1]=n;
        for(int i=0;i<hFences.length;i++){
            h[i+1]=hFences[i];
        }
        for(int i=0;i<vFences.length;i++){
            v[i+1]=vFences[i];
        }
        Arrays.sort(h);
        Arrays.sort(v);
        HashSet<Integer>s=new HashSet<>();
        for(int i=0;i<h.length;i++){
            for(int j=i+1;j<h.length;j++){
                s.add(h[j]-h[i]);
            }
        }
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<v.length;i++){
            for(int j=0;j<v.length;j++){
                if(s.contains(v[j]-v[i])){
                    ms=Math.max(ms,v[j]-v[i]);
                }
            }
        }
        if(ms==Integer.MIN_VALUE){
            return -1;
        }
        long MOD=1000000007;
        return (int)((1L*ms*ms)%MOD);
    }
}
}
