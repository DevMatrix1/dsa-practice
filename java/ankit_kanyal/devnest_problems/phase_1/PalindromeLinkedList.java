// link- https://devsnest.in/algo-challenges/palindrome-linked-list

static Node getReverseHead(Node head){
		Node cur=head;
		Node prev=null;
		Node next=null;
		
		while(cur!=null){
			next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		return prev;
	}

static int solve(Node list){
//CODE HERE 
    int length=0;
	Node cur=list;
	Node head=new Node(cur.data);
	Node temp=head;
	while(cur!=null){
		cur=cur.next;
		length++;
		if(cur==null) break;
		temp.next=new Node(cur.data);
		temp=temp.next;
			
	}
	// generating reverse linkedlist
	Node reverse=getReverseHead(list);
	int mid=length/2;
		
	while(mid>0){
			
		if(head.data!=reverse.data){
			return 0;
		}
		if(head.next==null) break;
		head=head.next;
		reverse=reverse.next;
		mid--;
			
	}
	return 1;
}


