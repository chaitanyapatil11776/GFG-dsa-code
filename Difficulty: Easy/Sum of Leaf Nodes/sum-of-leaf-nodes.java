/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
 static  int sum=0;
     static boolean ss(Node root){
         if(root==null)return false;
         if(root.left==null && root.right==null)return true;
         return false;
     }
     static void helper(Node root){
         if(root==null)return ;
         if(ss(root.left)){
             sum+=root.left.data;
         }
         if(ss(root.right)){
             sum+=root.right.data;
         }
         helper(root.left);
         helper(root.right);
         
     }
    // Function to return sum of all nodes of a binary tree
    static int leafSum(Node root) {
        // Your code here
        sum=0;
          if (root.left == null && root.right == null) {
            return root.data;
        }
        if(root==null)return 0;
        helper(root);
        return sum;
        
    }
}