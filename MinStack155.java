import java.util.*;
class MinStack {
    //static int min=Integer.MAX_VALUE;
    Stack<Integer>st;
    Stack<Integer>min;

    public MinStack() {
        //Stack<Integer>st=new Stack<>();
        st=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        //min=Math.min(min,val);
        if(min.isEmpty()||val<=min.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
        if(st.isEmpty()){
            return;
        }
        int ans=st.pop();
        if(ans==min.peek()){
            min.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */