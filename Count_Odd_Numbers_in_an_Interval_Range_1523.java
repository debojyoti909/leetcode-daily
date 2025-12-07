class Solution {
    public int countOdds(int low, int high) {
        int dis=high-low;
        if(low%2==0 && high%2==0){
            return dis/2;
        }else if(low%2==1 && high%2==1){
            return dis/2+1;
        }else{
            return (dis+1)/2;
        }
    }
}