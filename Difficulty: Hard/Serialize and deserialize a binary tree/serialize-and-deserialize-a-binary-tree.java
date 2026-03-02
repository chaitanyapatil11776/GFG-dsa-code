class Solution {
    
    int i = 0;

    void helper(Node root, ArrayList<Integer> ss) {
        if (root == null) {
            ss.add(-1);
            return;
        }

        ss.add(root.data);
        helper(root.left, ss);
        helper(root.right, ss);
    }

    public ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> ss = new ArrayList<>();
        helper(root, ss);
        return ss;
    }

    public Node deSerialize(ArrayList<Integer> arr) {
        if (i >= arr.size() || arr.get(i) == -1) {
            i++;
            return null;
        }

        Node root = new Node(arr.get(i++));
        root.left = deSerialize(arr);
        root.right = deSerialize(arr);
        return root;
    }
}