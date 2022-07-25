def cutinhalf(head):
    if not head or not head.next:
        return None
    slow, fast = head, head.next
    while fast.next and fast.next.next:
        slow = slow.next
        fast = fast.next.next
    if fast.next:
        slow = slow.next
    t = slow.next
    slow.next = None
    return t
    
def reverse(head):
    if not head or not head.next:
        return head
    p,c,n = head, head.next, head.next.next
    while n:
        c.next = p
        p, c, n = c ,n , n.next
    head.next = None
    c.next = p
    return c

def solve(head):
    # CODE HERE
    h = cutinhalf(head)
    h = reverse(h)
    p = head

    while h:
        x = h.next
        h.next = p.next
        p.next = h
        p = p.next.next
        h = x
    return head