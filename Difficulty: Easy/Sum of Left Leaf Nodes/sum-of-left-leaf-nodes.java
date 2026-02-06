// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {
    int sum=0;
    boolean ss(Node root){
        if(root==null)return false;
        if(root.left==null && root.right==null)return true;
        return false;
        
    }
    void helper(Node  root){
        if(root==null)return;
        if(ss(root.left)){
            sum+=root.left.data;
            
        }
        helper(root.left);
        helper(root.right);
    }

    public int leftLeavesSum(Node root) {
        // Write your code here
        sum=0;
        if(root==null)return 0;
        helper(root);
        return sum;
    }
}