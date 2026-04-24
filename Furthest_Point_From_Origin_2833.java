public class Furthest_Point_From_Origin_2833 {
    class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0;
        int r=0;
        int d=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                l++;
            }else if(moves.charAt(i)=='R'){
                r++;
            }else{
                d++;
            }
        }
        if(l>r){
            return l+d-r;
        }
        if(r>l){
            return r+d-l;
        }
        return d;
    }
}
}
