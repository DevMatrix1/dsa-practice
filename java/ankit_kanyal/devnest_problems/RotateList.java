// link- https://devsnest.in/algo-challenges/rotate-list

static Node solve(Node head, int k){
//CODE HERE 

int length=0;
Node cur=head;

while(cur!=null){
    cur=cur.next;
    length++;
}
k=k%length;
if(k==0) return head;
cur=head;
while(length-k>1){
    cur=cur.next;
    length--;
}
Node rotate=cur.next;
cur.next=null;
cur=rotate;
while(cur.next!=null){
    cur=cur.next;
}
cur.next=head;

return rotate;
}