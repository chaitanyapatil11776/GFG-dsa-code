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
    Node mergeKLists(Node[] arr) {
        // code here
        ArrayList<Integer>aa=new ArrayList<>();
        for(Node node:arr){
            while(node!=null){
                aa.add(node.data);
                node=node.next;
            }
        }
        Collections.sort(aa);
        
        Node dummy=new Node(0);
        Node curr=dummy;
        for(int x:aa){
            curr.next=new Node(x);
            curr=curr.next;
        }
        return dummy.next;
    }
}