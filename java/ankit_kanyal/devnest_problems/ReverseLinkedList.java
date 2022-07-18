// link- https://devsnest.in/algo-challenges/reverse-linked-list

static Node solve(Node head){
//CODE HERE 
    Node prev=null;
	Node cur=head;
	Node next=null;
		
	while(cur!=null){
		next=cur.next;
        cur.next=prev;
	    prev=cur;
	    cur=next;
			
	}
	return prev;
}