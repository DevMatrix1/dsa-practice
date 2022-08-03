def solve(l1, l2):
    # CODE HERE
    list_ref = Node(-1)
    head = list_ref
    ptr1, ptr2 = l1,l2

    while ptr1 != None and ptr2!= None:
        if ptr1.data < ptr2.data:
            list_ref.next = ptr1
            list_ref = list_ref.next
            ptr1 = ptr1.next
        else:
            list_ref.next = ptr2
            list_ref = list_ref.next
            ptr2 = ptr2.next
    
    if ptr1 == None:
        list_ref.next = ptr2
    else:
        list_ref.next = ptr1
    return head.next
