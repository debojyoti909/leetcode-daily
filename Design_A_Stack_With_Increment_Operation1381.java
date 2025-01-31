import java.util.*;
class CustomStack {
    class Node{
        int val;
        Node prev;
        Node next=null;
        Node(int val){
            this.val=val;
            this.prev=null;
            this.next=null;
        }
    }
    HashMap<Node,Node>map=new HashMap<>();
    Node head=new Node(-1);
    Node tail=new Node(-1);
    static int capc=0;
    public Node delete(){
        // Node temp=tail.prev;
        // Node pre=temp.prev;
        // pre.next=tail;
        // tail.prev=pre;
        // return temp;
        if(head.next==tail)return null;
        Node temp=head.next;
        //Node nex=temp.next;
        head.next=temp.next;
        temp.next.prev=head;
        return temp;
    }

    public void add(Node node){
        Node temp=head.next;
        head.next=node;
        node.next=temp;
        temp.prev=node;
        node.prev=head;
    }


    public CustomStack(int maxSize) {
        map.clear();
        capc=maxSize;
        head.next=tail;
        tail.prev=head;

    }
    
    public void push(int x) {
        if(map.size()<capc){
        Node node=new Node(x);
        add(node);
        map.put(node,node);
        }
    }
    
    public int pop() {
        //if(map.size()==0)return -1;
        Node node=delete();
        if(node==null)return -1; 
        map.remove(node);
        return node.val;
    }
    
    public void increment(int k, int val) {
        Node temp=tail.prev;
        while(k!=0 && temp!=head){
            Node node=temp;
            node.val=node.val+val;
            //map.put(node.val,map.getOrDefault(node.val,0)+val);
            // map.remove(node.val);
            // map.put(node.val,node);
            k--;
            temp=temp.prev;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */

