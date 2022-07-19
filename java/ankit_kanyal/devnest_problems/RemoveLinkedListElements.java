// link- https://devsnest.in/algo-challenges/remove-linked-list-elements

static Node solve(Node head, int key){
//CODE HERE 
    if(head.data == key)
        {
            head = head.next;
        }
    Node cur=head;
    Node prev=new Node(-1);
    Node next=null;
    while(cur!=null){
        next=cur.next;
        if(cur.data==key){
            cur.next=null;
            prev.next=next;
            cur=next;

        }
        else{
            prev=cur;
            cur=next;
        }
       
    }
    return head;
}