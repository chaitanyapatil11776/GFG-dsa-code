/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node deleteAtPosition(Node head, int pos) {
        // code here
          if (pos == 1) return head.next;

        Node temp = head;
        for (int i = 1; i < pos - 1; i++)
            temp = temp.next;

        temp.next = temp.next.next;
        return head;
    }
}