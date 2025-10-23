class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb;
        // if(s.length()<2){
        //     return false;
        // }
        while(s.length()>2){
            sb=new StringBuilder();
            for(int i=0;i<s.length()-1;i++){
                int f=s.charAt(i)-'0';
                int se=s.charAt(i+1)-'0';
                int res=(f+se)%10;
                sb.append(res);
                // .tostring()
            }
            s=sb.toString();
        }
        // if(s.length()<2){
        //     return false;
        // }
        // if(s.charAt(0)==s.charAt(1)){
        //     return true;
        // }else{
        //     return false;
        // }
        return s.charAt(0)==s.charAt(1);
    }
}