import java.util.*;
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        int sum2=0;
        Arrays.sort(capacity);
        int cnt=0;
        for(int i=capacity.length-1;i>=0;i--){
            sum2+=capacity[i];
            cnt++;
            if(sum<=sum2){
                return cnt;
            }
        }
        return -1;
    }
}