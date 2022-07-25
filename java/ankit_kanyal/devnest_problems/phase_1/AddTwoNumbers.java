// link- https://devsnest.in/algo-challenges/add-two-numbers-ii

static Node solve(Node l1, Node l2){
//CODE HERE 
Node list1=reverse(l1);
Node list2=reverse(l2);

int carry=0;
Node head=list1;
Node prev=null;
while(list1!=null && list2!=null){
    int sum=list1.data+list2.data+carry;
    list1.data=sum%10;
    carry=sum/10;
    prev=list1;
    list1=list1.next;
    list2=list2.next;
}
if(list1==null){
    prev.next=list2;
    Node cur=prev.next;
    while(cur!=null){
        int sum=cur.data+carry;
        cur.data=sum%10;
        carry=sum/10;
        cur=cur.next;
    }
}

if(list2==null){
    while(list1!=null){
        int sum=list1.data+carry;
        list1.data=sum%10;
        carry=sum/10;
        list1=list1.next;
    }
}

    Node ans=reverse(head);

if(carry==1){
    Node temp=new Node(1);
    temp.next=ans;
    ans=temp;

}

return ans;
}

static Node reverse(Node head){
    Node prev=null;
    Node next=null;
    Node cur=head;

    while(cur!=null){
        next=cur.next;
        cur.next=prev;
        prev=cur;
        cur=next;
    }

    return prev;
}