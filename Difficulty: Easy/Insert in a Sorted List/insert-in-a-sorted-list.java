/*class Node
{
	int data;
	Node next;
	Node(int d) {data = d; next = null; }
} */

// sortedInsert method should return the head of the modified linked list.
class Solution {
	Node sortedInsert(Node head, int key) {
		// Add your code here.
		
		Node nn = new Node(key);
		if(head == null || head.data>=key) {
			nn.next = head;
			return nn;
		}
		Node temp = head;
		while (temp .next!= null && temp.next.data<key) {
			temp = temp.next;
		}
		nn.next = temp.next;
		temp.next = nn;
		return head;
	}
}
