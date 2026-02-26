/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Tree {
    public ArrayList<Integer> reverseLevelOrder(Node root) {
        // code here
        
        Queue<Node>q=new LinkedList<>();
        ArrayList<Integer>ss=new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            ss.add(curr.data);
            if(curr.right!=null){
                q.add(curr.right);
            }if(curr.left!=null){
                q.add(curr.left);
            }
        }
        Collections.reverse(ss);
        return ss;
        
    }
}