def solve(head):
    # CODE HERE
    if not head or not head.next:
        return head
    p1 = head
    p2 = head.next
    x = p2.next
    p2.next = p1
    p1.next = solve(x)
    return p2