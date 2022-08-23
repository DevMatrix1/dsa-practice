def solve(head):
    # CODE HERE
    if not head or not head.next:
        return head

    node1 = head
    node2 = head.next
    kat = node2.next

    node2.next = node1
    node1.next = solve(kat)

    return node2
  
#  or
def solve(head):
    # CODE HERE
    if not head:
        return head

    prev = None
    itr = head
    kat = head.next
    while itr and itr.next:
        nxt = itr.next
        if prev:
            prev.next = nxt
        
        itr.next = nxt.next
        nxt.next = itr
        prev = itr
        itr = itr.next
    
    return kat or head  
  
