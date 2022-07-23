// link- https://devsnest.in/algo-challenges/partition-list?tab=question

static Node solve(Node head, int x){
    if(head==null || head.next==null) return head;

    Node small=null,smaller=null;
    Node big=null,bigger=null;

    while(head!=null){
        if(head.data<x){
          if(small==null){
              small=head;
              smaller=head;
          }else{
             small.next=head;
             small=head;
          }
        }else{
           if(big==null){
              big=head;
              bigger=head;
           }else{
             big.next=head;
             big=head;
           }
        }
        head=head.next;
    } 

    if(small==null) return bigger;
    if(big==null) return smaller;

    small.next=bigger;
    big.next=null;

    return smaller;
}