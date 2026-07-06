/*  structure of a binary tree node
class Node
{
    int data;
    Node left;
    Node right;
    Node(int x) {
        data = x;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static int maxPathSum(Node root) {
        // code here
        if(root==null)return 0;
        if(root.left==null && root.right==null){
            return root.data;
            
        }
        
        if(root.left==null){
            return root.data+(maxPathSum(root.right));
        }if(root.right==null){
            return root.data+(maxPathSum(root.left));
        }
        return root.data+Math.max(maxPathSum(root.left),maxPathSum(root.right));
        
    }
}