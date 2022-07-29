def solve(head, key):
    # CODE HERE
    ptr = head
    prev = None
    while ptr != None:
        if ptr == head and ptr.data == key:
            head = ptr = head.next
        else:
            if ptr.data == key:
                prev.next = ptr.next
                ptr = ptr.next
            else:
                prev = ptr
                ptr=ptr.next
    return head

    #recursive approach
    if not head:
        return None
    if head.data == key:
        return solve(head.next, key)
    ne = solve(head.next, key)
    head.next = ne
    return head
