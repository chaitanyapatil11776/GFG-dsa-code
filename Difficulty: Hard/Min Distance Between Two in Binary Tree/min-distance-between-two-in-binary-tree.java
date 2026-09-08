class Solution {

    public int findDist(Node root, int a, int b) {
        Node lca = findLCA(root, a, b);

        int d1 = distance(lca, a, 0);
        int d2 = distance(lca, b, 0);

        return d1 + d2;
    }

    Node findLCA(Node root, int a, int b) {
        if (root == null || root.data == a || root.data == b)
            return root;

        Node left = findLCA(root.left, a, b);
        Node right = findLCA(root.right, a, b);

        if (left == null)
            return right;

        if (right == null)
            return left;

        return root;
    }

    int distance(Node root, int target, int dist) {
        if (root == null)
            return -1;

        if (root.data == target)
            return dist;

        int left = distance(root.left, target, dist + 1);

        if (left != -1)
            return left;

        return distance(root.right, target, dist + 1);
    }
}