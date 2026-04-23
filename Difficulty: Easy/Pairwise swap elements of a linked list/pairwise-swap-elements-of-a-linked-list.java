/* node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head) {
        // code here
        Node curr=head ;
        int count=0;
        Node prv=null;
        Node next=null;
        while(curr!=null  && count<2){
            next=curr.next;
            curr.next=prv;
            prv=curr;
            curr=next;
            count++;
        }
        if(next!=null){
            head.next=pairwiseSwap(next);
        }
        return prv;
        
        
        
    }
}