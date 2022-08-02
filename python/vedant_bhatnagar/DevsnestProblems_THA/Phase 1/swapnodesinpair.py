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

#iterative approach
    if not head or not head.next:
            return head
        p1 = head
        x = None
        tmp = p2=head.next
        while p1.next.next and p2.next.next:
            x = p2.next
            p1.next = x
            p2.next = p1
            p1.next = x.next
            p1 = x
            p2 = x.next
        p1.next = p2.next
        p2.next = p1
        return tmp