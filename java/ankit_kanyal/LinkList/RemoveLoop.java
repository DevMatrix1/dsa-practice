// link- https://workat.tech/problem-solving/practice/remove-loop-linked-list

// solution- https://workat.tech/problem-solving/practice/remove-loop-linked-list/editorial

class Solution {
	void removeLoop(ListNode list) {
	    // add your logic here
		 if (list == null || list.next == null) {
			return;
		}
		ListNode slowPtr = list.next, fastPtr = list.next.next;
		ListNode prevNode = list.next;
		while (fastPtr != null && fastPtr.next != null) {
			if(slowPtr == fastPtr) {
				slowPtr = list;
				break;
			}
			slowPtr = slowPtr.next;
			prevNode = fastPtr.next;
			fastPtr = fastPtr.next.next;
		}
		if (fastPtr == null || fastPtr.next == null) {
			return;
		}
		while (slowPtr != fastPtr) {
			prevNode = fastPtr;
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next;
		}
		prevNode.next = null;
		return;
	}
}