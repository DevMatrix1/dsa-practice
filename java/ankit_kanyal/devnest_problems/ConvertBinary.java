// link- https://devsnest.in/algo-challenges/convert-binary-number-in-a-linked-list-to-integer

static int solve(Node head){
//CODE HERE 
    int counter=0;
    Node cur=head;
    while(cur!=null){
        counter+=1;
        cur=cur.next;
    }
    int ans=0;
    while(head!=null){
        ans+=Math.pow(2,counter-1)*head.data;
        counter--;
        head=head.next;
    }

    return ans;
}