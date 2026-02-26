/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        
        ArrayList<Integer>ss=new ArrayList<>();
        solve(root,0,ss);
        return ss;
    }
    void solve(Node root,int level,ArrayList<Integer>ans){
        if(root==null)return ;
        if(level==ans.size()){
            ans.add(root.data);
        }
        solve(root.left,level+1,ans);
        solve (root.right,level+1,ans);
    }
}