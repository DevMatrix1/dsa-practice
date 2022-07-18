// link- https://devsnest.in/algo-challenges/merge-two-sorted-lists

static Node solve(Node l1, Node l2){
//CODE HERE 
    Node head=new Node(-1);
    Node cur=head;
    Node temp;
    while(l1!=null && l2!=null){
        if(l1.data<=l2.data){
            temp=new Node(l1.data);
            cur.next=temp;
            cur=temp;
            l1=l1.next;
        }
        else{
            temp=new Node(l2.data);
            cur.next=temp;
            cur=temp;
            l2=l2.next;
        }

    }

    if(l1==null){
        while(l2!=null){
            temp=new Node(l2.data);
            cur.next=temp;
            cur=temp;
            l2=l2.next;
        }
    }
    if(l2==null){
        while(l1!=null){
            temp=new Node(l1.data);
            cur.next=temp;
            cur=temp;
            l1=l1.next;
        }
    }

    return head.next;
}