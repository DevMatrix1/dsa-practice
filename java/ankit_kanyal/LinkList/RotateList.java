// link- https://workat.tech/problem-solving/practice/rotate-linked-list

class Solution {
	ListNode rotateListByK(ListNode head, int k) {
		// add your logic here
		ListNode cur=head;
		int len=0;
		while(cur!=null){
			len++;
			cur=cur.next;
		}
		if(len==0) return head;
		k=k%len;
		if(k==0) return head;
		cur=head;
		while(len-k>1){
    		cur=cur.next;
    		len--;
		}
		ListNode rotate=cur.next;
		cur.next=null;
		cur=rotate;
		while(cur.next!=null){
    		cur=cur.next;
		}
		cur.next=head;

		return rotate;
	}
}