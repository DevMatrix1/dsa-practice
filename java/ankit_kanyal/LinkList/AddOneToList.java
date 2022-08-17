// link- https://workat.tech/problem-solving/practice/add-one-linked-list


class Solution {
	ListNode addOneToList(ListNode head) {
		// add your logic here
		ListNode reversed=reverseNode(head);
		int carry=1;
		ListNode cur=reversed;
		ListNode prev=null;
		while(cur!=null){
			int sum=carry+cur.data;
			cur.data=sum%10;
			carry=sum/10;
			prev=cur;
			cur=cur.next;
		}
		if(carry==1){
			ListNode temp=new ListNode(1);
			prev.next=temp;
		}
		ListNode ans=reverseNode(reversed);
		return ans;
	}
	
	ListNode reverseNode(ListNode head){
		ListNode cur=head;
		ListNode prev=null;
		ListNode next=null;
		
		while(cur!=null){
			next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		
		return prev;
	}
}