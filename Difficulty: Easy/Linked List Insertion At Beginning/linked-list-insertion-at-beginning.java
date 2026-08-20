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
        Node nn=new Node(x);
        nn.next=head;
        head=nn;
        return head;
        
    }
}