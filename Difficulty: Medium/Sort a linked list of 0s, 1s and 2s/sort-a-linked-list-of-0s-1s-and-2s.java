/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        int c0=0;
        int c1=0;
        int c2=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0)c0++;
            else if(temp.data==1)c1++;
            else{
                c2++;
            }
            temp=temp.next;
        }
        temp=head;
        
        while(c0-->0){
            temp.data=0;
            temp=temp.next;
        }
         while(c1-->0){
            temp.data=1;
            temp=temp.next;
    }
     while(c2-->0){
            temp.data=2;
            temp=temp.next;
}
return head;
}
}