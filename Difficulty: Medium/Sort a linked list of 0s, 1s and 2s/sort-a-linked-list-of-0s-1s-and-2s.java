/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        int c0=0;
        int c1=0;
        int c2=0;

        Node curr=head;
        while(curr!=null){
            if(curr.data==0)c0++;
            else if(curr.data==1)c1++;
            else c2++;
            
            curr=curr.next;
        }
        
        curr=head;
        
        while(c0-->0){
            curr.data=0;
            curr=curr.next;
        }
        while(c1-->0){
            curr.data=1;
            curr=curr.next;
        }
        while(c2-->0){
            curr.data=2;
            curr=curr.next;
        }
        
        return head;
    }
}