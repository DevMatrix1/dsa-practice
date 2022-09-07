/** This is the ListNode class definition

class ListNode {
	int data;
	ListNode next;

	ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}
**/

// link- https://workat.tech/problem-solving/practice/insertion-sort-linked-list
class Solution {
	ListNode insertionSort(ListNode head) {
		// add your logic here
		if(head==null||head.next==null){
        return head;
    }
    ListNode sorted = new ListNode(Integer.MIN_VALUE);
    ListNode i = head;
    while(i!=null){
        ListNode nxt = i.next;
        sorted = sortedInsert(sorted,i);
        i=nxt;
    }
    head = sorted;
    return head.next;
	}
	
	ListNode sortedInsert(ListNode head,ListNode new_node){
    ListNode cur = null;
    if(head==null|head.data>=new_node.data){
        new_node.next = head;
        head = new_node;
    }else{
        cur=head;
        while(cur.next!=null&&cur.next.data<new_node.data){
            cur=cur.next;
        }
        new_node.next = cur.next;
        cur.next = new_node;
    }
    return head;
}
}