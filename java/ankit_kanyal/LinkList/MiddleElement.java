// link- https://workat.tech/problem-solving/practice/middle-element-linked-list;

class Solution {
	int getMiddleElementOfLinkedList (ListNode list) {
	    // add your logic here
		int count=0;
		ListNode cur=list;
		while(cur!=null){
			count++;
			cur=cur.next;
		}
		int mid=count/2;
		if(count%2==1) mid+=1;
	
		while(--mid>0){
			list=list.next;
		}
		return list.data;
		
		
	}
}