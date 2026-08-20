/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        
        Node nn=new Node(x);
        if(head==null)return nn;
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        
        curr.next=nn;
        return head;
    }
}