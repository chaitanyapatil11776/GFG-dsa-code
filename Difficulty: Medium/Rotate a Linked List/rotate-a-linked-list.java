/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        if(head==null   ||  head.next==null  ||k==0)return head;
        int n=1;
        Node curr=head;
        while(curr.next!=null){
            n++;
            curr=curr.next;
        }
        
        k=k%n;
        if(k==0)return head;
        curr.next=head;
        Node tail=head;
        int jump=k;
        while(jump>1){
            tail=tail.next;
            jump--;
        }
        
        Node pp=tail.next;
        tail.next=null;
        return pp;
    }
}