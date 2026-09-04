/* Structure of Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
        // code hereAr
        ArrayList<Integer>ll=new ArrayList<>();
        if(root==null)return null;
        Queue<Node>que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int size=que.size();
            while(size-->0){
                Node curr=que.poll();
                ll.add(curr.data);
                if(curr.left!=null){
                    que.add(curr.left);
                }
                if(curr.right!=null){
                    que.add(curr.right);
                }
            }
        }
        return ll;
        
    }
}