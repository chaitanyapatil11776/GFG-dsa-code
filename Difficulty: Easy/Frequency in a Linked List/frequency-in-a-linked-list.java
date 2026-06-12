/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}
*/

class Solution {
    public int count(Node head, int key) {
        // code here
        int count=0;
        while(head!=null)
        {
            if(head.data==key){
                count++;
            }
            head=head.next;
        }
        
        return count;
    }
}