/* Definition for Node
class Node
{
    int data;
    Node left;
    Node right;
    Node(int val)
    {
        this.data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<ArrayList<Integer>> paths(Node root) {
        // code here
        ArrayList<Integer>ll=new ArrayList<>();
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ss(root,ans,ll);
        return ans;
        
        
    }
    
    void ss(Node root,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>ll){
        
        if(root==null)return ;
        ll.add(root.data);
        if(root.left==null && root.right==null){
            ans.add(new ArrayList<>(ll));
        }else{
            ss(root.left,ans,ll);
            ss(root.right,ans,ll);
        }
        ll.remove(ll.size()-1);
        
        
    }
}