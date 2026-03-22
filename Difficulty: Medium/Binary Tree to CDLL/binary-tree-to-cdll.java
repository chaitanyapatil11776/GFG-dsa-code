/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    Node prv=null;
    Node head=null;
    Node bTreeToCList(Node root) {
        // code here
        
        ss(root);
        if(head!=null && prv!=null){
            head.left=prv;
            prv.right=head;
        }
        return head;
    }
    void ss(Node root){
        if(root==null)return;
        ss(root.left);
        if(prv==null){
            head=root;
        }else{
            root.left=prv;
            prv.right=root;
        }
        prv=root;
        ss(root.right);
    }
}