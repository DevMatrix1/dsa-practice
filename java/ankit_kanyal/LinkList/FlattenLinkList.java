// link- https://workat.tech/problem-solving/practice/flatten-multi-level-linked-list

// hint- https://workat.tech/problem-solving/approach/fmlll/flatten-multi-level-linked-list

class Solution {
	
	ListNode mergeTwoList(ListNode list1, ListNode list2) {
		if (list1 == null && list2 == null) return null;
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			ListNode result = list1;
			result.next = mergeTwoList(list1.down, null);
			result.down = null;
			return result;
		}
		ListNode result;
		if (list1.data < list2.data) {
			result = list1;
			result.next = mergeTwoList(list1.down, list2);
		}
		else {
			result = list2;
			result.next = mergeTwoList(list1, list2.next);
		}
		result.down = null;
		return result;
	}

	ListNode flattenTheLinkedList(ListNode root) {
		if (root == null) return root;
		return mergeTwoList(root, flattenTheLinkedList(root.next));
	}
}