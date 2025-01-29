import java.util.*;
class StockSpanner {
    private Stack<int []>st=new Stack<>();
    private int ind=-1;
    public StockSpanner() {
        ind=-1;
        st.clear();
    }
    
    public int next(int price) {
        ind=ind+1;
        while(!st.isEmpty()&& st.peek()[0]<=price){
            st.pop();
        }
        int nge=st.isEmpty()?-1:st.peek()[1];
        int res=ind-nge;
        st.push(new int[]{price,ind});
        return res;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */