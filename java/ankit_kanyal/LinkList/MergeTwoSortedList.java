// link- https://workat.tech/problem-solving/practice/merge-sorted-linked-list

class Solution {
	ListNode mergeTwoSortedList (ListNode firstList, ListNode secondList) {
	    // add your logic here
		ListNode head=new ListNode(0);
		if(firstList==null && secondList==null) return null;
		if(firstList==null) return secondList;
		if(secondList==null) return firstList;
		
		if(firstList.data>secondList.data){
			head=secondList;
			secondList=secondList.next;
		}
		else{
			head=firstList;
			firstList=firstList.next;
		}
		head.next=mergeTwoSortedList(firstList,secondList);
		return head;
	}
}