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
    public int lengthOfLoop(Node head) {
        // code here
        if(head==null)return 0;
        Node s=head;
        Node f=head;
        while(f!=null  && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                int count=1;
                Node temp=s.next;
                while(temp!=s){
                    count++;
                    temp=temp.next;
                }
                return count;
            }
        }
        return 0;
 
    }
}