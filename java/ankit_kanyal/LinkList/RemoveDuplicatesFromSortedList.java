// link- https://workat.tech/problem-solving/practice/remove-duplicates-sorted-linked-list
class Solution {
	ListNode removeDuplicates(ListNode head) {
		// add your logic here
		if(head==null || head.next==null) return head;
		ListNode temp=head;
		while(temp.next.next!=null){
			if(temp.next.next!=null && temp.data==temp.next.data){
				temp.next=temp.next.next;
			}
			else if(temp.next!=null){
				
				temp=temp.next;
			}
		}
		if(temp.data==temp.next.data) temp.next=null;
		return head;
	}
}