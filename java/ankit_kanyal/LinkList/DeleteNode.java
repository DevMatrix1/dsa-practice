// link- https://workat.tech/problem-solving/practice/delete-node-linked-list

class Solution {

	void deleteNode(ListNode node) {
    // add your logic here
	while (node.next.next!=null) {
		node.data = node.next.data;
		node = node.next;
	}
	node.data = node.next.data;
	node.next = null;
}
}