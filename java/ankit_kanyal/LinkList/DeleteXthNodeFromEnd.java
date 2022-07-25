// link- https://workat.tech/problem-solving/practice/delete-xth-node-end-linked-list

class Solution {
	ListNode removeXthNodeFromEnd(ListNode head, int x) {
		ListNode cur=head;
		int length=0;
		while(cur!=null){
			length++;
			cur=cur.next;
		}
		int rem=length-x;
		if(rem==0) return head.next;
		cur=head;
		while(cur!=null){
			if(rem==1){
				cur.next=cur.next.next;
				break;
			}
			cur=cur.next;
			rem--;
		}
		return head;
	}
}