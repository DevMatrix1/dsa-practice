// link- https://workat.tech/problem-solving/practice/find-xth-node-end-linked-list

class Solution {
	ListNode xthNodeFromEnd(ListNode head, int x) {
		// add your logic here
		ListNode cur=head;
		int length=0;
		while(cur!=null){
			length++;
			cur=cur.next;
		}
		int rem=length-x;
		
		cur=head;
		while(cur!=null){
			if(rem==0) return cur;
			cur=cur.next;
			rem--;
		}
		return null;
	}
}