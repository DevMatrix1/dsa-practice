def solve(head):
    # CODE HERE
    prev_node = next_node = None
    curr = head
    while curr != None:
        next_node = curr.next
        curr.next = prev_node
        prev_node = curr
        curr = next_node
    head = prev_node
    return head


    #second approach
    if not head or not head.next:
        return head
    p,c,n = head, head.next, head.next.next
    while n:
        c.next = p
        p = c
        c = n
        n = n.next
    head.next = None
    c.next = p
    return c

    #recursion
    if not head:
        return None
    if head.next == None:
        return head
    reverse = solve(head.next)
    head.next.next = head
    head.next = None
    return reverse