// User function Template for Java

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution {
    public static Node insertionSort(Node head_ref) {
        // code here
        return mergersort(head_ref);
    }
    
    static Node mergersort(Node head){
        if(head==null || head.next==null)return head;
        Node prv=null;
        Node s=head;
    Node f=head;
        while(f!=null && f.next!=null){
            prv=s;
            s=s.next;
            f=f.next.next;
            
        }
        if(prv!=null){
            prv.next=null;
        }
        
        Node p1=mergersort(head);
        Node p2=mergersort(s);
        Node mm=merger(p1,p2);
        return mm;
    }
    
    
    static Node merger(Node h1,Node h2){
        Node dummy=new Node(-1);
        Node curr=dummy;
        while(h1!=null && h2!=null){
            if(h1.data<=h2.data){
                curr.next=h1;
                h1=h1.next;
            }else{
                 curr.next=h2;
                h2=h2.next;
            }
            curr=curr.next;
        }
    
    if(h1!=null)curr.next=h1;
    if(h2!=null)curr.next=h2;
     
     return dummy.next;
    }
    
}