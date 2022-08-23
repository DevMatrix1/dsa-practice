def solve(head, k):
    # CODE HERE
    if not head or not head.next or k==0:
        return head
    
    l = 1
    itr = head
    while itr.next:
        l += 1
        itr = itr.next
    
    itr.next = head
    rotate = int(k%l)
    r = l - rotate

    while r:
        itr = itr.next
        r -= 1
    
    head = itr.next
    itr.next = None

    return head
