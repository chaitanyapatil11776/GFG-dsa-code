
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        
        Node nn = new Node(val);

        if (pos == 1) {
            nn.next = head;
            return nn;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        nn.next = temp.next;
        temp.next = nn;

        return head;
    }
}