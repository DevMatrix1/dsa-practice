// link- https://workat.tech/problem-solving/practice/remove-occurences-linked-list

class Solution {
	ListNode removeOccurences(ListNode head, int key) {
		// add your logic here
		ListNode cur=head;
		if(head==null) return null;
		while(cur!=null){
			
			while(cur.next!=null && cur.next.data==key){
				cur.next=cur.next.next;
			}
			cur=cur.next;
		}
		if(head.data==key){
            head=head.next;
        }
		return head;
	}
}

// another approach-

class Solution {
	ListNode removeOccurences(ListNode head, int key) {
		while (head != null && head.data == key) {
			head = head.next;
		}
		ListNode currentNode = head;
		while (currentNode != null && currentNode.next != null) {
			if (currentNode.next.data == key) {
				currentNode.next = currentNode.next.next;
			}
			else {
				currentNode = currentNode.next;
			}
		}
		return head;
	}
}