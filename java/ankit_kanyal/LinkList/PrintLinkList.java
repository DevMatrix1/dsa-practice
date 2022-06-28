// link- https://workat.tech/problem-solving/practice/print-linked-list

/** This is the ListNode class definition

class ListNode {
	int data;
	ListNode next;

	ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}
**/

class Solution {
	void printLinkedList (ListNode head) {
	    // add your logic here
		while(head!=null){
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
}