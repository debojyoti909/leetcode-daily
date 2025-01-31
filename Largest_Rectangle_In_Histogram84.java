import java.util.*;
class Solution {
    public int largestRectangleArea(int[] heights) {
        int nse[]=new int[heights.length];
        int pse[]=new int[heights.length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
                st.pop();
            }
            pse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty()&& heights[st.peek()]>=heights[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?heights.length:st.peek();
            st.push(i);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            int area=(nse[i]-pse[i]-1)*heights[i];
            max=Math.max(max,area);
        }
        return max;
    }
}