public class Minimum_String_Length_After_Balanced_Removals_3746 {
    
    public int minLengthAfterRemovals(String s) {
       int ca=0;
       int cb=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='a'){
            ca++;
        }else{
            cb++;
        }
       }
       return Math.abs(ca-cb); 
    }
}

