def solve(head, x):
    # CODE HERE
    tmp2 = dummy2 = prev = Node(123)
    ptr = head
    tmp = dummy = Node(123)
    while ptr:
        if ptr.data < x:
            dummy.next = ptr
            dummy = dummy.next
            prev.next = ptr.next
            ptr = ptr.next
        else:
            dummy2.next = ptr
            dummy2 = dummy2.next
            prev = ptr
            ptr = ptr.next
    dummy.next = tmp2.next
    return tmp.next if tmp.next else head
    