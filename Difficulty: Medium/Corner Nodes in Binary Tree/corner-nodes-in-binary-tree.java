/* Node class of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/

class Solution {
    public List<Integer> getCorner(Node root) {
        // code 
        
        ArrayList<Integer>ss=new ArrayList<>();
        Queue<Node>qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            int size=qu.size();
            for(int i=0;i<size;i++){
                Node curr=qu.poll();
                
                
                if(i==0 || i==size-1){
                    ss.add(curr.data);
                }
                if(curr.left!=null){
                    qu.add(curr.left);
                }if(curr.right!=null){
                    qu.add(curr.right);
                }
            }
        
            
        }
       return ss;
        
        
    }
}