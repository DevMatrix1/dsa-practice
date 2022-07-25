// link- https://workat.tech/problem-solving/practice/add-numbers-lists

class Solution {
	
	ListNode addTwoNumbers(ListNode firstList, ListNode secondList) {
		// add your logic here
		ListNode l1=firstList;
    ListNode l2=secondList;
		int carry=0;
    ListNode head=new ListNode(-1);
    ListNode cur=head;
    while(l1!=null && l2!=null){
        int sum=l1.data+l2.data+carry;
        carry=sum/10;
        ListNode temp=new ListNode(sum%10);
        cur.next=temp;
        cur=temp;
        l1=l1.next;
        l2=l2.next;

    }

    if(l1==null){
        while(l2!=null){
            int sum=l2.data+carry;
            ListNode temp=new ListNode(sum%10);
            carry=sum/10;
            cur.next=temp;
            cur=temp;
            l2=l2.next;
        }
    }
    if(l2==null){
        while(l1!=null){
            int sum=l1.data+carry;
            ListNode temp=new ListNode(sum%10);
            carry=sum/10;
            cur.next=temp;
            cur=temp;
            l1=l1.next;
        }
    }

    if(carry==1){
        ListNode temp=new ListNode(1);
        cur.next=temp;
        cur=temp;
    }

    return head.next;
	}
}