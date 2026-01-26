/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        // code here
        Node s=head;
        Node f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                Node ff=ss(head,f);
                return ff.data;
            }
            
            
        }
        return -1;
        
    }
    public Node  ss(Node head,Node f)
    {
        while(head!=f){
            head=head.next;
            f=f.next;
        }
        return head;
    }
}