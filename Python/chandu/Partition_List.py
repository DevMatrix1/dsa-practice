def solve(head, x):
    # CODE HERE
    l1 = l1_head = Node(-1)
    l2 = l2_head = Node(-1)

    while head:
        if head.data <x:
            l1.next = head
            l1 = l1.next
        
        else:
            l2.next = head
            l2 = l2.next
        
        head = head.next
    
    # l2 should end to None
    l2.next = None
    # combine
    l1.next = l2_head.next

    return l1_head.next
