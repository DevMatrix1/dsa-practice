def solve(head):
    # CODE HERE
    if not head:
        return None
    p = Node(0)
    p.next = head
    head = p
    l = r = head.next
    while r:
        if l.data == r.data:
            r = r.next
        elif l.next is r:
            p.next = l
            p = l
            l = r
        else:
            l = r
    p.next = None if l.next else l
    return head.next