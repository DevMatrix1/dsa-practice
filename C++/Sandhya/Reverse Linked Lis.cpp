Node* solve(Node* &head){ 
    //CODE HERE 
Node *nextNode, *prevNode = NULL;

while (head) {
    nextNode = head->next;
    head->next = prevNode;
    prevNode = head;
    head = nextNode;
}

    return prevNode;
}
