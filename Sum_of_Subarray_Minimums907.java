import java.util.*;
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int nse[]=new int [arr.length];
        int pse[]=new int [arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?arr.length:st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty()&& arr[st.peek()]>arr[i]){
                st.pop();
            }
            pse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        int total=0;
        //int mod=1e+7;
        int mod = 1_000_000_007;
        for(int i=0;i<arr.length;i++){
            int l=i-pse[i];
            int r=nse[i]-i;
            //total=(total+(l*r*arr[i])%mod)%mod;
            long fin=(long)l*r%mod *arr[i]%mod;
            total=(total+(int)fin)%mod;
        }
        return total;
    }
}