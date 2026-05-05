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
    public ListNode rotateRight(ListNode head, int k) {
       if (head == null || head.next == null || k == 0) {
            return head;
        }
      ListNode temp=head;
      int len=1;
      while(temp.next!=null){
        len++;
        temp=temp.next;
      }
      temp.next=head;
      k=k%len;
      int step=len-k;
      ListNode temp2=head;
      for(int i=1;i<step;i++){
        temp2=temp2.next;
      }
      head=temp2.next;
      temp2.next=null;
      return head;
    }
}