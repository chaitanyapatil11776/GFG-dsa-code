class Solution {
    int sum=0;
    void helper(Node root){
        if(root==null)return;
        if(ss(root.right)){
            sum+=root.right.data;
            
        }
        helper(root.left);
        helper(root.right);
    }
    boolean ss(Node root){
        if(root==null)return false;
        if(root.left==null && root.right==null)return true;
        return false;
        
    }
    int rightLeafSum(Node root) {
        // code here
        sum=0;
        if(root==null)return 0;
        helper(root);
        return sum;
    }
}