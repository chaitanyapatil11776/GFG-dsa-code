/*
Definition for Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};
*/

class Solution {
    public int inOrderSuccessor(Node root, Node k) {
        // code here44
        Node succ=null;
        while(root!=null){
            if(k.data<root.data){
                succ=root;
                root=root.left;
            }
        else{
            root=root.right;
        }
        }
        
        return succ==null?-1:succ.data;
    }
}