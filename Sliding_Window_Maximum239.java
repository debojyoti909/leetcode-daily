import java.util.*;
class Solution {
    // static class pair implements Comparable<pair>{
    // int num;
    // int idx;
    // public pair(int num,int idx){
    //     this.num=num;
    //     this.idx=idx;
    // }
    // @Override
    // public int compareTo(pair b){
    //     return b.num-this.num;
    // }

//}
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int res[]=new int[n-k+1];
        // PriorityQueue<pair>pq= new PriorityQueue<>();
        // for(int i=0;i<k;i++){
        //     pq.add(new pair(nums[i], i));
        // }
        // res[0]=pq.peek().num;
        // for(int i=k;i<n;i++){
        //     while(pq.size()>0 && pq.peek().idx<=(i-k)){
        //         pq.remove();
        //     }
        //     pq.add(new pair(nums[i], i));
        //     res[i-k+1]=pq.peek().num;
        // }
        // return res;

        Deque<Integer>dq=new ArrayDeque<>();
        int m=0;
        for(int i=0;i<n;i++){
            if(!dq.isEmpty()&& dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty()&& nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                res[m]=nums[dq.peekFirst()];
                m++;
            }
        }
        return res;

    }
}