/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        ArrayList<Integer>ss=new ArrayList<>();
        if(root==null)return ss;
        boolean lefttoright=true;
        Queue<Node>que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int size=que.size();
            ArrayList<Integer>level=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node curr=que.poll();
                level.add(curr.data);
                
                if(curr.left!=null){
                    que.add(curr.left);
                }
                if(curr.right!=null){
                    que.add(curr.right);
                }
                
                
                
            }
            if(!lefttoright){
                Collections.reverse(level);
            }
            lefttoright=!lefttoright;
            ss.addAll(level);
        }
        return ss;
    }
}