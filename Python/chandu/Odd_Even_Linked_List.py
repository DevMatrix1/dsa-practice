def solve(head):
    # CODE HERE
    l = head 
    r = kat  =  head.next
    while r and r.next:
        l.next = r.next
        l = l.next
        r.next = l.next
        r = r.next
    
    l.next = kat
    return head
