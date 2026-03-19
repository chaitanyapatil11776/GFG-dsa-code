/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node next=null,prv=null,curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prv;
            prv=curr;
            curr=next;
        }
        return prv;
    }
}