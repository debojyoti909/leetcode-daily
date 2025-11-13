class Solution {
    public int maxOperations(String s) {
        int c=0;
        int res=0;
        int ind=0;
        while(ind<s.length()){
            if(s.charAt(ind)=='0'){
                while(ind+1<s.length() && s.charAt(ind+1)=='0'){
                    ind++;
                }
                res+=c;
            }else{
                c++;
            }
            ind++;
        }
        return res;
    }
}