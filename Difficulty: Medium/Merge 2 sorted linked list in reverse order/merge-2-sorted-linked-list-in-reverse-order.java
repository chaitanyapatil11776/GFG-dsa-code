/* Structure of the node*/
/* class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
} */

class Solution {
    Node rev(Node head){
        Node prv=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prv;
            prv=curr;
            curr=next;
            
        }
        return prv;
    }
    
    Node mm(Node n1,Node n2){
        if(n1!=null && n2!=null){
            if(n1.data<n2.data){
                n1.next=mm(n1.next,n2);
                return n1;
            }else{
                n2.next=mm(n2.next,n1);
                return n2;

            }
        }
        if(n1==null)return n2;
        return n2;
    }
    Node mergeResult(Node node1, Node node2) {
        // Your code here
        Node ss=mm(node1,node2);
        return rev(ss);
        
    }
}