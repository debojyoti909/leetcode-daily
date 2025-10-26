class Solution {
    public String lexSmallest(String s) {
        String res=s;
        for(int i=1;i<=s.length();i++){
            String rev=new StringBuilder(s.substring(0,i)).reverse().toString()+s.substring(i);
            if(rev.compareTo(res)<0){
                res=rev;
            }
        }
        for(int i=1;i<=s.length();i++){
            String rev2=s.substring(0,s.length()-i)+new StringBuilder(s.substring(s.length()-i)).reverse().toString();
            if(rev2.compareTo(res)<0){
                res=rev2;
            }
        }
        return res;
    }
}