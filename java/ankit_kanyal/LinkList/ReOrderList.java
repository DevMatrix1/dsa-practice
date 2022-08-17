// link- https://workat.tech/problem-solving/practice/reorder-linked-list

class Solution {
	ListNode reorderList(ListNode head) {
		// add your logic here
		 ListNode cur=head;
        ListNode dummy=new ListNode(-1);
        ListNode cur1=dummy;
		int len=0;
		while(cur!=null){
			len++;
            cur1.next=new ListNode(cur.data);
            cur1=cur1.next;
			cur=cur.next;
		}
		
		dummy=dummy.next;
		
		ListNode reverse=reverseNode(dummy);

		int count=len/2;
		
		ListNode ans= new ListNode(-1);
		cur=ans;
		cur1=head;
		
        while(count>0 && head!=null && reverse!=null){
            
			cur.next=new ListNode(cur1.data);
			cur=cur.next;
			cur.next=new ListNode(reverse.data);
			cur=cur.next;
			cur1=cur1.next;
			reverse=reverse.next;
			count--;
		}
        if(len%2==1 && cur!=null){
			cur.next=new ListNode(cur1.data);
		}
		
		
		return ans.next;
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