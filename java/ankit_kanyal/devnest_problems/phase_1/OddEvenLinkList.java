// link- https://devsnest.in/algo-challenges/odd-even-linked-list?tab=question

static Node solve(Node head){
//CODE HERE 
if (head == null) return null;

Node odd = head, even = head.next, evenHead = even;

while (even != null && even.next != null) {
        odd.next = even.next;
        odd = odd.next;
        even.next = odd.next;
        even = even.next;
}

    odd.next = evenHead;

    return head;
}