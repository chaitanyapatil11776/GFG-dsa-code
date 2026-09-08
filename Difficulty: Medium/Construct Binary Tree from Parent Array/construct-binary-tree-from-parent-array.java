class Solution {
    Node createTree(int[] parent) {

        int n = parent.length;
        Node[] nodes = new Node[n];

        // Create all nodes
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(i);
        }

        Node root = null;

        // Connect nodes with their parents
        for (int i = 0; i < n; i++) {

            if (parent[i] == -1) {
                root = nodes[i];
            } 
            else {
                Node p = nodes[parent[i]];

                if (p.left == null)
                    p.left = nodes[i];
                else
                    p.right = nodes[i];
            }
        }

        return root;
    }
}