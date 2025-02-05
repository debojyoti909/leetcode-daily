class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))return true;
        int count=0;
        char pre1='\0';
        char pre2='\0';
        char pos1='\0';
        char pos2='\0';
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(count==0){
                    pre1=s1.charAt(i);
                    pos1=s2.charAt(i);
                }
                if(count==1){
                    pre2=s1.charAt(i);
                    pos2=s2.charAt(i);
                }
                count++;
                if(count>2)return false;
            }
        }
        return (pre1==pos2 && pre2==pos1 && count==2);
    }
}