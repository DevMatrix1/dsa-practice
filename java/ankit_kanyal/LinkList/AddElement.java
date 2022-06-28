// link- https://workat.tech/problem-solving/practice/add-kth-element-linked-list

class Solution {
	ListNode addAtkthElement (ListNode head, int k, ListNode newElement) {
	    // add your logic here
		int count=1;
		ListNode cur=head;
		ListNode temp;
		if(k==1){
			newElement.next=head;
			return newElement;
		}
		while(cur!=null){
			if(k-1==count){
				temp=cur.next;
				cur.next=newElement;
				newElement.next=temp;
				return head;
			}
			count++;
			cur=cur.next;
			
		}
		return head;
	}
}