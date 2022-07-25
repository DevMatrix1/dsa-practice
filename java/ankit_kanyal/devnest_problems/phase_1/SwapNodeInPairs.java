// link- https://devsnest.in/algo-challenges/swap-nodes-in-pairs

static Node solve(Node head){
//CODE HERE 

Node cur=head;
Node next;

if(cur.next==null) return head;

while(cur!=null && cur.next!=null && cur.next.next!=null){
    next=cur.next;
    int temp=cur.data;
    cur.data=next.data;
    next.data=temp;
    cur=next.next;
   

}
if(cur.next!=null){
    next=cur.next;
    int temp=cur.data;
    cur.data=next.data;
    next.data=temp;
}

return head;
}