def solve(head):
    # CODE HERE
    if not head or not head.next or not head.next.next:
        return head
    o = head
    e = head.next
    while e and e.next:
        x = e.next
        e.next = e.next.next
        x.next = o.next
        o.next = x
        o = o.next
        e = e.next
    return head