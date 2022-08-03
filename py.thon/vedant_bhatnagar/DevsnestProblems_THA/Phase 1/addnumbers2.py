def make_lls_equal(l1,l2):
    p1, p2 = l1,l2
    while p1 or p2:
        if p1:
            p1 = p1.next
        else:
            n = Node(0)
            n.next = l1
            l1 = n
        if p2:
            p2 = p2.next
        else:
            n = Node(0)
            n.next = l2
            l2 = n
    return l1, l2
def solve(l1, l2):
    # CODE HERE
    if not l1.data or not l2.data:
        return l1 if l1.data else l2
    l1, l2 = make_lls_equal(l1,l2)
    any_l2 = True

    while any_l2:
        any_l2 = False
        l1_p, l2_p = l1,l2
        prev = None
        
        while l1_p:
            k = l1_p.data + l2_p.data
            l1_p.data = k%10
            l2_p.data = k//10
            any_l2 = any_l2 or bool(l2_p.data)
            prev = l2_p
            l2_p, l1_p = l2_p.next, l1_p.next
    
        prev.next = Node(0)
        if l2.data: 
            n = Node(0)
            n.next = l1
            l1 = n
        else:
            l2 = l2.next
    return l1