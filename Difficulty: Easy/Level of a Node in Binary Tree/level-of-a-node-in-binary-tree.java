class Solution {
    /* Returns level of given data value */
    int getLevel(Node node, int data) {
        // Write your code here
        if(node==null)return 0;
        if(node.data==data)return 1;
        int left=getLevel(node.left,data);
        if(left!=0)return left+1;
        int right=getLevel(node.right,data);
       return (right==0)?0:right+1;
    }
}