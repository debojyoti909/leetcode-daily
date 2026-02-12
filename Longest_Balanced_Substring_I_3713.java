class Solution {
    public boolean chk(HashMap<Character,Integer>m){
        int minv=Integer.MAX_VALUE;
        int maxv=0;
        for(char x:m.keySet()){
            minv=Math.min(minv,m.get(x));
            maxv=Math.max(maxv,m.get(x));
        }
        return minv==maxv;
    }
    public int longestBalanced(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer>m=new HashMap<>();
            for(int j=i;j<s.length();j++){
                m.put(s.charAt(j),m.getOrDefault(s.charAt(j),0)+1);
                if(chk(m)){
                    res=Math.max(res,(j-i+1));
                }
            }
        }
        return res;
    }
}