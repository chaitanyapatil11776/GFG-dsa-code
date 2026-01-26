/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
         if (head == null) return;
        // code here
        Node s=head;
        Node f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                ss(head,f);
                return ;            }
        }
        
    }
    public static void ss(Node head,Node meet){
        Node p1=head;
        Node p2=meet;
        while(p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }
        Node last=p1;
        while(last.next!=p1){
            last=last.next;
        }
         last.next=null;
    }
}