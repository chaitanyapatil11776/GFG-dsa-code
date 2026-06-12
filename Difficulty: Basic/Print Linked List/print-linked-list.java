/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer>ss=new ArrayList<>();
        Node curr=head;
        while(curr!=null){
            ss.add(curr.data);
            curr=curr.next;
        }return ss;
        
        
    }
}