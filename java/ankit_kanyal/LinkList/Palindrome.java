// link- https://workat.tech/problem-solving/practice/linked-list-palindrome

class Solution {
	
	ListNode getReverseHead(ListNode head){
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
	
	boolean isPalindrome(ListNode list) {
	    // add your logic here
		int length=0;
		ListNode cur=list;
		ListNode head=new ListNode(cur.data);
		ListNode temp=head;
		while(cur!=null){
			cur=cur.next;
			length++;
			if(cur==null) break;
			temp.next=new ListNode(cur.data);
			temp=temp.next;
			
		}
		// generating reverse linkedlist
		ListNode reverse=getReverseHead(list);
		
		int mid=length/2;
		
		while(mid>0){
			
			if(head.data!=reverse.data){
				
				return false;
			}
			if(head.next==null) break;
			head=head.next;
			reverse=reverse.next;
			mid--;
			
		}
		return true;
	}
}