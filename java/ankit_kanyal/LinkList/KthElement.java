// link- https://workat.tech/problem-solving/practice/kth-element-linked-list

class Solution {
	ListNode kthElement (ListNode head, int k) {
	    // add your logic here
		int count=1;
		while(head!=null){
			if(k==count) return head;
			count++;
			head=head.next;
		}
		return null;
	}
}