/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here

if(head==null ||head.next==null ||k==0 )return head;
Node curr=head;
int n=1;
while(curr.next!=null){
    curr=curr.next;
    n++;
}

k=k%n;
if(k==0)return head;
curr.next=head;
int jump=k;
Node tail=head;
while(jump>1){
    tail=tail.next;
    jump--;
}

Node pp=tail.next;
tail.next=null;
return pp;
    }
}