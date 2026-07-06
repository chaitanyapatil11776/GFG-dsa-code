class Solution {
    /* Returns level of given data value */
    int getLevel(Node node, int data) {
        // Write your code here
        if(node==null)return 0;
        if(node.data==data){
            return 1;
        }
        int l=getLevel(node.left,data);
        if(l!=0)return l+1;
        int r=getLevel(node.right,data);
      return (r==0)?0:r+1;   }
}