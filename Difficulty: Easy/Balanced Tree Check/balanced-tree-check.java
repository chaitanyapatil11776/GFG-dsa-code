/*
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    int helper(Node root){
        if(root==null)return 0;
        int left=helper(root.left);
        int right=helper(root.right);
        return 1+Math.max(left,right);
    }
    public boolean isBalanced(Node root) {
        // code here
        if(root==null)return true;
        int ll=helper(root.left);
        int rr=helper(root.right);
        if(Math.abs(ll-rr)>1)return false;
        boolean left=isBalanced(root.left);
        boolean right=isBalanced(root.right);
        if(!left || !right)return false;
        
        return true;
    }
}