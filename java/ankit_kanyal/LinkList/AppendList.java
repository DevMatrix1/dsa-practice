// link- https://workat.tech/problem-solving/practice/append-linked-lists

class Solution {
	ListNode appendLists (ListNode list1, ListNode list2) {
	    ListNode head = list1;
        while (list1.next != null) {
            list1 = list1.next;
        }
        list1.next = list2;
        return head;
	}
}