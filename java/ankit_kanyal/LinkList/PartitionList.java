// link- https://workat.tech/problem-solving/practice/partition-list

class Solution {
	ListNode partitionList(ListNode head, int key) {
		ListNode smallerHead = null, equalHead = null, greaterHead = null;
		ListNode smallerLast = null, equalLast = null, greaterLast = null;
		while (head != null) {
			if (head.data < key) {
				if(smallerHead == null) {
					smallerHead = smallerLast = head;
				} else {
					smallerLast.next = head;
					smallerLast = smallerLast.next;
				} 
			} else if (head.data == key) {
				if (equalHead == null) {
					equalHead = equalLast = head;
				} else {
					equalLast.next = head;
					equalLast = equalLast.next;
				}
			} else {
				if (greaterHead == null) {
					greaterHead = greaterLast = head;
				} else {
					greaterLast.next = head;
					greaterLast = greaterLast.next;
				}
			}
			head = head.next;
		}
		if (greaterHead != null) {
			greaterLast.next = null;
		}
		if (equalHead == null) {
			if (smallerHead == null) {
				smallerHead = greaterHead;
			} else {
				smallerLast.next = greaterHead;
			}
		} else {
			equalLast.next = greaterHead;
			if (smallerHead == null) {
				smallerHead = equalHead;
			} else {
				smallerLast.next = equalHead;
			}
		}
		return smallerHead;
	}
}