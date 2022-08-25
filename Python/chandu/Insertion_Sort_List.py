def solve(head):
    # CODE HERE
    prev = Node(-1)
    prev.next = head
    cur, itr = head, head.next
    while itr:
        if itr.data >= cur.data:
            cur = itr
            itr = itr.next 
            continue
        
        temp = prev
        while itr.data > temp.next.data:
            temp = temp.next
        
        cur.next = itr.next
        itr.next = temp.next
        temp.next = itr
        itr = cur.next
    
    return prev.next
