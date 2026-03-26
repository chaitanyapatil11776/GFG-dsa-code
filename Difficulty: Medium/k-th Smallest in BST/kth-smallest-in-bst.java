class Solution {
    int count = 0;
    int res = -1;

    void ss(Node root, int k) {
        if (root == null) return;

        ss(root.left, k);

        count++;
        if (count == k) {
            res = root.data;
            return;
        }

        ss(root.right, k);
    }

    public int kthSmallest(Node root, int k) {
        ss(root, k);
        return res;
    }
}