/*
Definition for Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public List<Integer> reverseLevelOrder(Node root) {
        // code here
        
        ArrayList<Integer>ss=new ArrayList<>();
        Queue<Node>qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            Node curr=qu.poll();
            ss.add(curr.data);
            if(curr.right!=null){
                qu.add(curr.right);
            }
            
            if(curr.left!=null){
                qu.add(curr.left);
            }
            
        }
        Collections.reverse(ss);
        return ss;
        

        
        
        
    }
}