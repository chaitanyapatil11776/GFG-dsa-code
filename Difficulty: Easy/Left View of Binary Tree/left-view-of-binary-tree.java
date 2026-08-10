/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer>ss=new ArrayList<>();
        sss(root,0,ss);
        return ss;
        
    }
    void sss(Node root,int level,ArrayList<Integer>ss){
        if(root==null)return ;
        if(level==ss.size())ss.add(root.data);
        sss(root.left,level+1,ss);
        sss(root.right,level+1,ss);
      
        
        
    }
}