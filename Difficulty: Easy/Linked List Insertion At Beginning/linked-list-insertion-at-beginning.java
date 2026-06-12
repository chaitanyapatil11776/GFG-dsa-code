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
    public Node insertAtFront(Node head, int x) {
        // code here
Node dummy=new Node(-1);
dummy.next=head;
Node nn=new Node(x);
nn.next=dummy.next;
dummy.next=nn;
return dummy.next;
    }
}