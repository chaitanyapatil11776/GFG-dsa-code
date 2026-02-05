/*complete the given function*/

/* class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution {
    static boolean ss(Node p,Node q){
        if(p==null && q==null)return true;
        if(p==null || q==null)return false;
        return (p.data==q.data) && ss(p.left,q.left) && ss(p.right,q.right);
    }
    public static boolean isSubtree(Node T, Node S) {
        if(T==null)return false;
        if(S==null)return true;
        if(ss(T,S))return true;
        return isSubtree(T.left,S) || isSubtree(T.right,S);
        // add code here.
    }
}