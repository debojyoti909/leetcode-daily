// class Solution {
//     class Pair implements Comparable<Pair>{
//         int idx;
//         long val;
//         long sum;
//         Pair left,right;
//         //Pair.right;
//         Pair(int idx,long val){
//             this.idx=idx;
//             this.val=val;
//         }
//         public int compareTo(Pair p){
//             if(this.right==null || p.right==null){
//                 return this.right==null?1:-1;
//             }
//             long diff=this.sum-p.sum;
//             return (diff!=0)?(diff<0?-1:1):(this.idx-p.idx);
//         }
//     }
//     public int minimumPairRemoval(int[] nums) {
//         TreeSet<Pair>set=new TreeSet<>();
//         int mismatches=0;
//         Pair prev=null;
//         for(int i=0;i<nums.length;i++){
//             Pair curr=new Pair(i,nums[i]);
//             if(prev==null){
//                 prev=curr;
//             }else{
//                 if(curr.val<prev.val){
//                     mismatches++;
//                 }
//                 prev.right=curr;
//                 curr.left=prev;
//                 prev.sum=prev.val+curr.val;
//                 set.add(prev);
//                 prev=curr;
//             }


//         }
//         set.add(prev);
//         int cnt=0;
//         while(mismatches>0){
//             Pair best=set.pollFirst();
//             if(best.right.val<best.val){
//                 mismatches--;
//             }
//             best.sum=best.val+best.right.sum;
//             best.val=best.val+best.right.val;
//             Pair del=best.right;
//             best.right=del.right;
//             if(del.right!=null){
//                 if(del.right.val<del.val){
//                     mismatches++;
//                 }
//                 del.right.left=best;
//                 if(best.val>best.right.val){
//                     mismatches++;
//                 }
//             }
//             set.remove(del);
//             set.add(best);
//             Pair left=best.left;
//             if(left!=null){
//                 set.remove(left);
//                 if(left.val>left.sum-left.val){
//                     mismatches--;
//                 }
//                 if(left.val>best.val){
//                     mismatches++;
//                 }
//                 left.sum=left.val+best.val;
//                 left.right=best;
//                 set.add(left);
//             }
//             cnt++;
//         }
//         return cnt;
//     }
// }

class Node {

    long value;
    int left;
    Node prev;
    Node next;

    Node(int value, int left) {
        this.value = value;
        this.left = left;
    }
}

class PQItem implements Comparable<PQItem> {

    Node first;
    Node second;
    long cost;

    PQItem(Node first, Node second, long cost) {
        this.first = first;
        this.second = second;
        this.cost = cost;
    }

    @Override
    public int compareTo(PQItem other) {
        if (this.cost == other.cost) {
            return this.first.left - other.first.left;
        }
        return this.cost < other.cost ? -1 : 1;
    }
}

public class Solution {

    public int minimumPairRemoval(int[] nums) {
        PriorityQueue<PQItem> pq = new PriorityQueue<>();
        boolean[] merged = new boolean[nums.length];

        int decreaseCount = 0;
        int count = 0;
        Node head = new Node(nums[0], 0);
        Node current = head;

        for (int i = 1; i < nums.length; i++) {
            Node newNode = new Node(nums[i], i);
            current.next = newNode;
            newNode.prev = current;
            pq.offer(
                new PQItem(current, newNode, current.value + newNode.value)
            );
            if (nums[i - 1] > nums[i]) {
                decreaseCount++;
            }
            current = newNode;
        }

        while (decreaseCount > 0) {
            PQItem item = pq.poll();
            Node first = item.first;
            Node second = item.second;
            long cost = item.cost;

            if (
                merged[first.left] ||
                merged[second.left] ||
                first.value + second.value != cost
            ) {
                continue;
            }
            count++;
            if (first.value > second.value) {
                decreaseCount--;
            }

            Node prevNode = first.prev;
            Node nextNode = second.next;
            first.next = nextNode;
            if (nextNode != null) {
                nextNode.prev = first;
            }

            if (prevNode != null) {
                if (prevNode.value > first.value && prevNode.value <= cost) {
                    decreaseCount--;
                } else if (
                    prevNode.value <= first.value && prevNode.value > cost
                ) {
                    decreaseCount++;
                }

                pq.offer(new PQItem(prevNode, first, prevNode.value + cost));
            }

            if (nextNode != null) {
                if (second.value > nextNode.value && cost <= nextNode.value) {
                    decreaseCount--;
                } else if (
                    second.value <= nextNode.value && cost > nextNode.value
                ) {
                    decreaseCount++;
                }

                pq.offer(new PQItem(first, nextNode, cost + nextNode.value));
            }

            first.value = cost;
            merged[second.left] = true;
        }

        return count;
    }
}