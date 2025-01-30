//Doubly LL and HashMap


import java.util.*;
class LRUCache {
    class Node{
        int key;
        int val;
        Node prev;
        Node next;
        Node(int key,int val){
            this.key=key;
            this.val=val;
            this.prev=null;
            this.next=null;
        }
    }

    void insert(Node node){
        Node temp=head.next;
        head.next=node;
        node.next=temp;
        node.prev=head;
        temp.prev=node;
    }

    void delete(Node node){
        //Node temp=tail.prev;
        Node pre=node.prev;
        Node nex=node.next;
        pre.next=nex;
        nex.prev=pre;
    }

    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);
    private int capc;
    HashMap<Integer,Node>map=new HashMap<>();

    public LRUCache(int capacity) {
        capc=capacity;
        map.clear();
        head.next=tail;
        tail.next=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node=map.get(key);
        delete(node);
        insert(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            map.remove(key);
            delete(node);
        }
        if(map.size()==capc){
            Node node=tail.prev;
            map.remove(node.key);
            delete(node);
        }
        Node node=new Node(key,value);
        map.put(key,node);
        insert(node);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */