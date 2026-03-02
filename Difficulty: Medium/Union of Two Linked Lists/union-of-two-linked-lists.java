/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    public static Node makeUnion(Node head1, Node head2) {
        // Code here
        TreeSet<Integer>ss=new TreeSet<>();
        while(head1!=null){
            ss.add(head1.data);
            head1=head1.next;
            
        }
        while(head2!=null){
            ss.add(head2.data);
            head2=head2.next;
        }
        Node dummy=new Node(0);
        Node curr=dummy;
        for(int val:ss){
            curr.next=new Node(val);
            curr=curr.next;
            
        }
        return dummy.next;
    }
}