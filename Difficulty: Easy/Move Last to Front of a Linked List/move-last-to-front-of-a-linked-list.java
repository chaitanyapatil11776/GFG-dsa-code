/*
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/

class Solution {
    public static Node moveToFront(Node head) {
        // code here
        if(head==null || head.next==null )return head;
        Node prv=null;
        Node curr=head;
        while(curr.next!=null){
            prv=curr;
            curr=curr.next;
        }
        
        prv.next=null;
        curr.next=head;
        return curr;
    }
}
