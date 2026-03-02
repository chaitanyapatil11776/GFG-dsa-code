/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    static void pp(Node root,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>arr){
        if(root==null)return ;
        arr.add(root.data);
        if(root.left==null && root.right==null){
            ans.add(new ArrayList<>(arr));
        }else{
            pp(root.left,ans,arr);
            pp(root.right,ans,arr);
        }
        arr.remove(arr.size()-1);
    }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>arr=new ArrayList<>();
        pp(root,ans,arr);
        return ans;
    }
}