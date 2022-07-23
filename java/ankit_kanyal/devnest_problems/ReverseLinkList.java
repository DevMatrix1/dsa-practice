// link- https://devsnest.in/algo-challenges/reverse-linked-list-ii?tab=question

static Node solve(Node head, int left, int right){
    Node leftPointer=head;
    Node rightPointer=head;
    Node l3=head;

    while(right>1){
        if(left>1){
            l3=leftPointer;
            leftPointer=leftPointer.next;
        }
        rightPointer=rightPointer.next;
        left--;
        right--;
    }
   
   
    Node l4=rightPointer.next;
     if(leftPointer==head){
        head=rightPointer;
    }
    rightPointer.next=null;
     Node n=Reverse(leftPointer,rightPointer);
     l3.next=rightPointer;
     leftPointer.next=l4;       
     
      return head;
}

public static Node Reverse(Node left,Node right){
    if(left==null || left==right ){
        return left;
    }

    Node newnode=Reverse(left.next,right);

    left.next.next=left;
    left.next=null;

    return newnode;
}