// link- https://devsnest.in/algo-challenges/remove-nth-node-from-end-of-list?tab=question

static Node solve(Node head, int n){
//CODE HERE 

int counter=0;
int length=0;
Node cur=head;

while(cur!=null){
    cur=cur.next;
    length++;
}
cur=head;

int position=length-n;
if(position==0) return cur.next;
while(cur!=null){
    if(counter+1==position){
        cur.next=cur.next.next;
        return head;
    }
    cur=cur.next;
    counter++;

}
return null;
}