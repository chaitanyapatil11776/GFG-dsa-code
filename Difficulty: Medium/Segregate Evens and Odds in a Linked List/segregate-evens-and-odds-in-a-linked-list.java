/* Structure of a link list node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    Node divide(Node head) {
        // code here
        Node evenD=new Node(-1);
        Node oldD=new Node(-1);
       Node even=evenD;
       Node old=oldD;
       Node temp=head;
       while(temp!=null){
           if(temp.data%2==0){
               even.next=temp;
               even=even.next;
               
           }else{
               old.next=temp;
               old=old.next;
           }
           temp=temp.next;
       }
       
       even.next=oldD.next;
       old.next=null;
       return evenD.next;
    }
}