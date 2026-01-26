class Solution {
    public boolean areIdentical(Node head1, Node head2) {

        Node p1 = head1;
        Node p2 = head2;

        // Traverse both lists together
        while (p1 != null && p2 != null) {
            if (p1.data != p2.data) {
                return false; // data mismatch
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // If both reached null, lists are identical
        return (p1 == null && p2 == null);
        // return false
    }
}
