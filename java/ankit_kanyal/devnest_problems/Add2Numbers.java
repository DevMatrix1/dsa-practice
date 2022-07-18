// link- https://devsnest.in/algo-challenges/add-two-numbers

static Node solve(Node l1, Node l2){
//CODE HERE 

    int carry=0;
    Node head=new Node(-1);
    Node cur=head;
    while(l1!=null && l2!=null){
        int sum=l1.data+l2.data+carry;
        carry=sum/10;
        Node temp=new Node(sum%10);
        cur.next=temp;
        cur=temp;
        l1=l1.next;
        l2=l2.next;

    }

    if(l1==null){
        while(l2!=null){
            int sum=l2.data+carry;
            Node temp=new Node(sum%10);
            carry=sum/10;
            cur.next=temp;
            cur=temp;
            l2=l2.next;
        }
    }
    if(l2==null){
        while(l1!=null){
            int sum=l1.data+carry;
            Node temp=new Node(sum%10);
            carry=sum/10;
            cur.next=temp;
            cur=temp;
            l1=l1.next;
        }
    }

    if(carry==1){
        Node temp=new Node(1);
        cur.next=temp;
        cur=temp;
    }

    return head.next;
}