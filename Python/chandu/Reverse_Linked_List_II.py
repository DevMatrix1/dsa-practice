def solve(head, left, right):
    # CODE HERE
    p_prev, p = None, head
    for _ in range(left-1):
        p_prev, p = p, p.next
    
    prev, curr = p, p.next
    for _ in range(right-left):
        curr.next, curr, prev = prev, curr.next, curr

    p.next = curr
    if p_prev:
        p_prev.next, prev = prev, head
    
    return prev
