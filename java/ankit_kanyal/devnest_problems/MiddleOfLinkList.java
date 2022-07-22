// link- https://devsnest.in/algo-challenges/middle-of-the-linked-list

static Node solve(Node head){
//CODE HERE 
    Node slow=head;
    Node fast=head.next;
    while(fast!=null){
        slow=slow.next;
        if(fast.next==null) break;
        fast=fast.next.next;
    }

    return slow;
}