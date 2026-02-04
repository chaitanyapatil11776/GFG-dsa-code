/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    int sum=Integer.MIN_VALUE;
    int ss(Node root){
        if(root==null)return 0;
        int left=Math.max(ss(root.left),0);
        int right=Math.max(ss(root.right),0);
        int max=root.data+left+right;
        sum=Math.max(sum,max);
        return root.data+Math.max(left,right);
    }
    int findMaxSum(Node root) {
        // code here
        ss(root);
        return sum;
        
    }
}