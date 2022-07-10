// link- https://workat.tech/problem-solving/practice/intersection-two-linked-lists

ListNode* getIntersectionNode(ListNode *A, ListNode *B) {
    // add your logic here
    if(A == NULL || B == NULL)
        return NULL;
    if(A == B)
        return A;
    
    ListNode* temp1 = A;
    ListNode* temp2 = B;
    
    
    
    while(temp1 != temp2)
    {
        temp1 = temp1 -> next;
        temp2 = temp2 -> next;
        
        if(temp1 == NULL && temp2 == NULL)
            return NULL;
        
        if(temp1 == NULL)
            temp1 = B;
        if(temp2 == NULL)
            temp2 = A;
    }
    return temp1;
}