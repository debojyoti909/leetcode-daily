import java.lang.classfile.components.ClassPrinter.ListNode;

public class Maximum_Twin_Sum_of_a_Linked_List_2130 {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2;
        ListNode prev=null;
        ListNode curr=slow;
        ListNode next;
        int count=0;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        head2=prev;
        int key=0;
        int max=Integer.MIN_VALUE;
        while(head2!=null){
            int twinSum = head.val + head2.val;
            max = Math.max(max, twinSum);
            head=head.next;
            head2=head2.next;
        }
        return max;
    }
}
}
