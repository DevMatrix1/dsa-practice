def solve(head, n):
    # CODE HERE
    if not head or n==0 or not head.next:
        return head
    itr = head
    l = 1
    while itr.next:
        l += 1
        itr = itr.next
    
    if n==l:
        return head.next
    rotate = int(n%l)
    idx = l - rotate -1
    kat = head
    while idx:
        kat = kat.next
        idx -= 1
    
    node = kat.next
    if node.next:
        kat.next = node.next
    else:
        kat.next = None
    node.next = None

    return head
