/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    
    boolean dfs(Node root,int target,HashSet<Integer>set){
        if(root==null)return false;
        if(set.contains(target-root.data)){
            return true;
        }
        set.add(root.data);
        return dfs(root.left,target,set) || dfs(root.right,target,set);
    }
    boolean findTarget(Node root, int target) {
     
        HashSet<Integer>ss=new HashSet<>();
        return dfs(root,target,ss);
        
    }
}