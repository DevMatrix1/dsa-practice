// link- https://workat.tech/problem-solving/practice/delete-kth-element-linked-list

class Solution {
	ListNode removekthElement (ListNode head, int k) {
	    // add your logic here
		int count=1;
		if(k==1){
			head=head.next;
			
		}
		ListNode cur=head;
		while(cur!=null){
			if(k-1==count){
				ListNode temp=cur.next.next;
				cur.next=temp;
				break;
			}
			count++;
			cur=cur.next;
		}
		return head;
	}
}