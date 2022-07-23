// link- https://devsnest.in/algo-challenges/insertion-sort-list?tab=question

static Node solve(Node head){
    if(head==null||head.next==null){
        return head;
    }
    Node sorted = new Node(Integer.MIN_VALUE);
    Node i = head;
    while(i!=null){
        Node nxt = i.next;
        sorted = sortedInsert(sorted,i);
        i=nxt;
    }
    head = sorted;
    return head.next;
}
static Node sortedInsert(Node head,Node new_node){
    Node cur = null;
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