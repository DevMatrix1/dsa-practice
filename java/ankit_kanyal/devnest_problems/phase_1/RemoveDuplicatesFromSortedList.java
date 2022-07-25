// link- https://devsnest.in/algo-challenges/remove-duplicates-from-sorted-list-ii?tab=question

static Node solve(Node head){
if(head==null||head.next==null){
        return head;
    }
    Node ans = new Node(-1);
    Node prev = ans;
    prev.next = head;
    Node cur = head;
    while(cur.next!=null){
        if(cur.next!=null && cur.data==cur.next.data){
            while(cur.next!=null && cur.data==cur.next.data){
                cur=cur.next;
            }
            prev.next=cur.next;
        }else{
            prev=prev.next;
        }
        if(cur.next!=null)cur=cur.next;
    }
    return ans.next;
}