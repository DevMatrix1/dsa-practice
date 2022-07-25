// link- https://devsnest.in/algo-challenges/reorder-list?tab=question

static Node getMiddle(Node head){

Node slow = head;

Node fast = head;
    
while(fast != null && fast.next != null){
    slow = slow.next;
    fast = fast.next.next;
}

return slow;
}

static Node reverseLinkedList(Node head){

Node prev = null;

Node curr = head;

while(curr != null){
    Node next_node = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next_node;
}       

return prev;
}

static Node solve(Node head){
//CODE HERE 

if (head == null || head.next == null){
     return head;
}
Node middle = getMiddle(head);
    
Node first = head;
Node second = reverseLinkedList(middle);
    
while(second.next != null){
    Node temp = first.next;
    first.next = second;
    first =  second;
    second = temp;
}

return head;


}