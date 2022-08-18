// link- https://workat.tech/problem-solving/practice/detect-loop-linked-list

class Solution {
	ListNode getStartingNodeOfLoop(ListNode list){
		// add your logic here
		if(list.next==null) return null;
		ListNode slowPtr=list.next;
		ListNode fastPtr=list.next.next;
		while(fastPtr!=null && fastPtr.next!=null){
			if(slowPtr == fastPtr) {
				slowPtr = list;
				break;
			}
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		if (fastPtr == null || fastPtr.next == null) {
			return null;
		}
		while (slowPtr != fastPtr) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next;
		}
		return slowPtr;
	}
}